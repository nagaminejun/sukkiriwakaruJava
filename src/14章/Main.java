public class Main {
  public static void main(String[] args) {
    // Empty e = new Empty();
    // System.out.println(e);
    // String s = e.toString();
    // System.out.println(s);
    // int i = e;
    // System.out.println(i);

    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 100;
    System.out.println(h1 + "    " + h2);

    // 以下の実行は、違う内容ですとなる。「同じ内容です」とするために、Heroクラスで
    // equalsメソッドのオーバーライドをします。要確認。

    if (h1.equals(h2) == true) {
      System.out.println("同じ内容です");
    } else {
      System.out.println("違う内容です");
    }
  }
}

/* nagaminejun@nagaminejunnoMacBook-Air 14章 % java Main
名前：ミナト／HP：100    名前：ミナト／HP：100
違う内容です

h1とh2が異なる内容になってしまう理由は、Javaのequalsメソッドがデフォルトではオブジェクトの参照の比較を行うためです。つまり、h1とh2は別々のオブジェクトであり、それぞれ異なるメモリ領域を指しているため、equalsメソッドによって等しいと判定されません。
equalsメソッドをオーバーライドして、オブジェクトのフィールドを比較するようにカスタマイズすることで、望む動作を実現することができます。 */
