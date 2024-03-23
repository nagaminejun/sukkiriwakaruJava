public class Dancer extends Character {
  public void dance() {
    System.out.println(this.name + "は情熱的に踊った");
  }
  // 抽象化メソッドをオーバーライドをし忘れるとコンパイルエラー。忘れそう。。
  // エラー: Dancerはabstractでなく、Character内のabstractメソッドattack(Matango)をオーバーライドしません
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に3ポイントのダメージ");
    m.hp -= 3;
  }
}
