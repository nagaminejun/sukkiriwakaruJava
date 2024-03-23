public abstract class Character {
  String name;
  int hp;
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
  public abstract void attack(Matango m);
  //public abstract void fireball(Matango m); // この記述ないと、Main.javaのc.fireball(m);でコンパイルエラー
}
