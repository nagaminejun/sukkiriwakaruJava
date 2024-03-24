import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main(); // Mainクラスのオブジェクトを生成
    // String s1 = "スッキリJava";
    // String s2 = "Java";
    // String s3 = "java";
    // if (s2.equals(s3)) {
    //   System.out.println("s2とs3は等しい");
    // }
    // // 大文字小文字を区別せず等しいか調べるメソッド　equalsIgnoreCase()
    // if (s2.equalsIgnoreCase(s3)) {
    //   System.out.println("s2とs3はケースを区別しなければ等しい");
    // }
    // System.out.println("s1の長さは" + s1.length() + "です");
    // if (s1.isEmpty()) {
    //   System.out.println("s1は空文字です");
    // }

    // String s11 = "Java and JavaScript";
    // if (s11.contains("Java")) {
    //   System.out.println("文字列s11は、Javaを含んでいます");
    // }
    // if (s11.endsWith("Java")) {
    //   System.out.println("文字列s11は、Javaが末尾にあります");
    // }
    // System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    // // 左から0から数えて9番目です
    // System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

    // String a1 = "Java pro888graming";
    // System.out.println("文字列a1の4文字目以降は" + a1.substring(3));        // ⇒ a pro888graming
    // // 8番目の文字は含まれない。出力は0~7の文字
    // System.out.println("文字列a1の4～8文字目以降は" + a1.substring(3, 8));  // ⇒ a pro

    // // replaceメソッド 交換する
    // String originalString = "Hello, world! oooooooooo";
    // String replacedString = originalString.replace('o', 'x'); // o を、x に交換する
    // System.out.println("元の文字列: " + originalString); // Hello, world! oooooooooo
    // System.out.println("置換後の文字列: " + replacedString); // Hellx, wxrld! xxxxxxxxxx

    // // StringBuilderメソッド、

    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 100; i++) {
    //   sb.append("java ");
    // }
    // String result = sb.toString(); // 記述なくても、この処理はデフォルトで実行するが、コードの明示性、可読性のため記述推奨
    // System.out.println(result);

    // Hero hero = new Hero();
    // hero.name = "A1234567";
    // boolean isValid = hero.isValidPlayerName(hero.name); // isValidPlayerNameメソッドを呼び出し

    // System.out.println("プレイヤー名 " + hero.name + " は有効ですか？ " + isValid);
    //   // isValidがfalseの場合にメッセージを出力
    // if (!isValid) {
    //     System.out.println("プレイヤー名はアルファベット大文字1文字と、アルファベット大文字または数字の合計7文字でなければなりません。");
    // } else {
    //   System.out.println("プレイヤー名は有効です！！！！！！！！！！");
    // }
    // String s4 = "abc,def:ghi";
    // String[] words = s4.split("[,:]");
    // System.out.println(words[0] + "-" + words[1] + "-" + words[2]);
    // for (String w : words) {
    //   System.out.print(w + "->");
    // }

    // String s5 = "abc,def:ghi";
    // String w = s5.replaceAll("[beh]", "x");
    // System.out.println(w);

    // int age = 30;
    // String name = "John";
    // String name1 = "!!!!!!!!!!";
    // String formattedString = String.format("My name is %s My name is %s and I am %d years old.", name, name1, age);
    // System.out.println(formattedString);
    
    // // 小数点以下の桁数を指定して浮動小数点数をフォーマットする
    // double pi = Math.PI;
    // String formattedPi = String.format("PI is approximately %.2f", pi);
    // System.out.println(formattedPi);

    // //long型
    // long start = System.currentTimeMillis();
    // //
    // long end = System.currentTimeMillis();
    // System.out.println("処理にかかった時間は..." + (end-start) + "ミリ秒でした");

    // Date型
    // Date now = new Date();
    // System.out.println(now + " new Date()");
    // System.out.println(now.getTime() + " now.getTime()");
    // Date past = new Date(1600705425827L);
    // System.out.println(past);

    // Calendarメソッド
    Calendar c = Calendar.getInstance();
    c.set(2019,8,22,1,23,45);
    System.out.println(c);
    System.out.println("");
    c.set(Calendar.MONTH, 9);
    int month = c.get(Calendar.MONTH);
    System.out.println("月: " + (month + 1)); // 月は0から始まるため、+1する
    System.out.println(c);
    System.out.println("月: " + (c.get(Calendar.MONTH) + 1));
    System.out.println(": " + (c.get(Calendar.ERA) + 1));
    System.out.println(": " + (c.get(Calendar.YEAR) + 1));
    System.out.println("");
    Date d = c.getTime();
    System.out.println(d);
    Date now = new Date();
    c.setTime(now);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です");

    // 和暦の日付を取得
    JapaneseDate japaneseDate = JapaneseDate.now();
    
    // 和暦を文字列にフォーマットして出力
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("GGGGy年M月d日", Locale.JAPAN);
    String formattedDate = japaneseDate.format(formatter);
    System.out.println("今日の和暦日付は: " + formattedDate);

    // ZoneIdクラス、Instant、ZonedDateTime
    // Instant i1 = Instant.now;
    // Instant i2 = Instant.ofEpochMilli(1600705425827L);
    // long l = i2.toEpochMilli();

    // LocalDateTimeクラス
    // LocalDateTime l1 = LocalDateTime.now();
    // LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate ldate = LocalDate.parse("2020/09/22", fmt);

    LocalDate ldatep = ldate.plusDays(1000);
    String str = ldatep.format(fmt);
    System.out.println("1000日後は" + str);

    LocalDate lnow = LocalDate.now();
    if (lnow.isAfter(ldatep)) {
      System.out.println("1000日後は過去日付です");
    }

    LocalDate d1 = LocalDate.of(2020,1,1);
    System.out.println(d1);
    System.out.println("");
    LocalDate d2 = LocalDate.of(2020,1,4);
    System.out.println(d2);
    System.out.println("");

    Period p1 = Period.ofDays(3);
    System.out.println(p1);
    System.out.println("");
    Period p2 = Period.between(d1, d2);
    System.out.println(p2);
    System.out.println("");

    LocalDate d3 = d2.plus(p2);
     System.out.println(d3);
  }
  // public boolean isValidPlayerName(String name) {
  //   return name.matches("[A-Z][A-Z0-9]{7}");
  //   // return name.matches("[A-Z]{2}[A-Z0-9]{3,5}[A-Z0-9]{2}");
  // }

}
