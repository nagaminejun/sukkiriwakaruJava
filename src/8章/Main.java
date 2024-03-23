public class Main {
  public static void main(String[] args) {
    // 1.勇者を生成

    SuperHero sh = new SuperHero();
    sh.run();
    System.out.println("スーパーヒーローの、、" + sh);

    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h1 = new Hero("ミナト[コンストラクタ有]");
    //h1.name = "ミナト";
    //h1.hp = 100;
    System.out.println("コンストラクタ実行 " + h1.hp);

    Hero h2 = new Hero();
    h2.name = "アサカ[コンストラクタ無しver]";
    h2.hp = 100;
    System.out.println("コンストラクタ実行してh2のhp " + h2.hp);

    h1.sword = s;
    System.out.println("勇者" + h1.name + "を生み出しました！");
    System.out.println("現在の武器は" + h1.sword.name);
    // 3.勇者のメソッドを呼び出してゆく

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    //h.sit(5);
    
    h1.attack();
    h1.slip();
    m1.run();
    m2.run();
    //h.sit(25);
    h1.run();
  }
}
