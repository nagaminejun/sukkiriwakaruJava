public class SuperHero extends Hero {
  boolean flying;

  public SuperHero() {
    super();
    System.out.println("SuperHeroコンストラクタ動作");
  }

  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
  public void run() {
    System.out.println(this.name + "は撤退！「オーバーライド！！！！」");
  }
}
