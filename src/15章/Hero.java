public class Hero {
  String name;
  int hp;
  static int money; // 静的フィールド、勇者全員で共有する存在、

  /* … */
  public String toString() {
    return "名前：" + this.name + "／HP：" + this.hp;
  }

  public boolean isValidPlayerName(String name) {
    return name.matches("[A-Z][A-Z0-9]{7}");
    // return name.matches("[A-Z]{2}[A-Z0-9]{3,5}[A-Z0-9]{2}");
  }

  public static void setRandomMoney() {
    Hero.money = (int)(Math.random() * 1000);
    // 以下の処理はエラー。静的メソッド内では、静的メンバしか使えない。this.name
    // エラー文　staticでない変数 thisをstaticコンテキストから参照することはできません
    //System.out.println(this.name + "たちの所持金を初期化しました");
  }

  // public boolean equals(Object o) {
  //   if (this == o) { return true; }
  //   if (o instanceof Hero) {
  //     Hero h = (Hero)o;
  //     if (this.name.equals(h.name)) {
  //       return true;
  //     }
  //   }
  //   return false;
  // }
}
