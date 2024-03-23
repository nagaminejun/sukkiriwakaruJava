public class Hero {
  private int hp; // hpフィールドは、他クラスから安易に呼び出させたくないため、private
  private String name;
  private Sword sword;

  // Mainクラスで、勇者の名前を指定できるようにするためのメソッド
  public void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("名前がnullである。処理を中断。");
    }
    if (name.length() <= 1) {
      throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
    }
    if (name.length() >= 8) {
      throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
    }
    this.name = name; // thisを忘れると大事故になる。
    //return this.name; ここを記述すると、値を返さないvoidなのに不適合なエラーが発生する
  }

  // Kingクラスで、勇者の名前を呼び出せるようにするためのメソッド
  public String getName() {
    return this.name; // thisを忘れると大事故になる。
  }

  public void bye() { 
    System.out.println("勇者は別れを告げた");
  }

  // このメソッドは、他クラスから安易に呼び出させたくないため、private
  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVERです。");
  }
  // public を外すことで、package privateとみなされ、同じパッケージクラスからしか呼び出せない。
  void sleep() { 
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した！");
  }
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    /* … */
    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
    this.hp -= 2;
    if (this.hp <= 0 ) {
      this.die();
    }
  }
  /* … */
}
