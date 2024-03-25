public class Person {
  int age;
  public void setAge(int age) {
    if (age < 0) {
      // 例外インスタンスを自分で投げる throwする
      throw new IllegalArgumentException("年齢は正の数を指定すべきです。指定値=" + age);
    }
    this.age = age;
  }
}
