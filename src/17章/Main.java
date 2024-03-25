import java.io.*;

public class Main {
  public static void main(String[] args) {

    try {
      throw new UnsupportedMusicFileException("オリジナル例外処理実装でテストエラー");
    } catch (Exception e) {
      e.printStackTrace();
    }

    Person p = new Person();
    p.setAge(1);

    // ① try-with-resources文 Java 7以降で利用可能、finallyブロック不要、自動でクローズする
    try (FileWriter fw = new FileWriter("data.txt")) {
      fw.write("try-with-resources で記述");
    } catch (Exception e) {
      System.out.println("エラーです");
    }

    // ②Java 7より前の実装。close処理を要す、近年では①を活用することが多い。
    FileWriter fw = null; // = new FileWriter("data.txt");
    try {
      // 下記コード右辺で、指定されたパスにファイルが存在しない場合、ファイルを作成しようとする際にFileNotFoundExceptionがスローされる、その場合の例外処理も必要。最下部にchatGPT解説
      fw = new FileWriter("data2.txt");
      fw.write("hello!111111");
    } catch (Exception e) {
      System.out.println("エラーです");
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch(Exception e) {
          ;
        }
      }
    }

    //確かに、new FileWriter("data.txt")はファイルが存在しなければ新しいファイルを作成し、存在すればそのファイルを上書きするため、通常は問題ありません。そのため、右辺で例外が発生する可能性は少ないと言えます。ただし、実際の開発ではファイルの存在を確認することが重要な場合もあります。例えば、ファイルが存在しない場合に新しいファイルを作成するのではなく、エラーを通知する必要があるかもしれません。また、ファイルの存在確認や操作にはOSのファイルシステムに依存するため、ファイルが存在しない場合やファイルを開けない場合などのエラーが発生する可能性があります。ただし、実際の開発ではファイルの存在を確認することが重要な場合もあります。例えば、ファイルが存在しない場合に新しいファイルを作成するのではなく、エラーを通知する必要があるかもしれません。また、ファイルの存在確認や操作にはOSのファイルシステムに依存するため、ファイルが存在しない場合やファイルを開けない場合などのエラーが発生する可能性があります。

    // FileWriter fw = new FileWriter("data.txt");
    // try {
    //   FileWriter fw = new FileWriter("data.txt");
    //   /* : */
    // // } catch(IOException e) {
    // //   System.out.println("エラーが発生しました。");
    // }
  }
}

// catch文をきちんと書かないとエラー
// Main.java:5: エラー: 'try'への'catch'、'finally'またはリソース宣言がありません
//     try {
//     ^
// Main.java:12: エラー: 構文解析中にファイルの終わりに移りました
// }
//  ^
// エラー2個
