public class Main {
  public static void main(String[] args) {
    //Life lf = new Wizard();

    Monster[] monsters = new Monster[3];
    monsters[0] = new Slime();
    monsters[1] = new Goblin();
    monsters[2] = new DeathBat();

    for (Monster m : monsters) {
      m.run();
    }

    Wizard w = new Wizard();
    Character c = w;
    Matango m = new Matango();

    c.name = "アサカ";
    c.attack(m);
    //ここからエラー、Character.java8行目参照して
    //c.fireball(m);
    //以下でも可能
    //((Wizard)c).fireball(m); // cという変数をWizard型にキャストしています。これにより、cが実際にはWizardクラスのインスタンスを参照していることを明示的に示しています

    // 修正前、重複多いため、リファクタリングすると、
    // Hero h1 = new Hero();
    // Hero h2 = new Hero();
    // Thief t1 = new Thief();
    // Wizard w1 = new Wizard();
    // Wizard w2 = new Wizard();
    
    
    // h1.hp += 50;
    // h2.hp += 50;
    // t1.hp += 50;
    // w1.hp += 50;
    // w2.hp += 50;

     // 修正後、for文でまとめる
    // Character[] c = new Character[5];
    // c[0] = new Hero();
    // c[1] = new Hero();
    // //c[2] = new Thief();
    // c[3] = new Wizard();
    // c[4] = new Wizard();

    // for (Character ch : c) {
    //   ch.hp += 50;
    // }
  }
}
