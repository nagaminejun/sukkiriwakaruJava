import java.util.ArrayList;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
     // ArrayList<int> はエラー。
    // ArrayList<Integer> points = new ArrayList<Integer>();
    // points.add(10);
    // points.add(80);
    // points.add(75);
    // for (int i : points) {
    //   System.out.println(i);
    //   System.out.println(points);
    // }

    //Iterator
    ArrayList<String> names = new ArrayList<String>();
    names.add("湊");
    names.add("朝香");
    names.add("菅原");
    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      System.out.println(it);
      String e = it.next();
      System.out.println(e);
    }

    System.out.println("");

    // LinkedListのインスタンスを作成
    LinkedList<Integer> numbers = new LinkedList<>();

    // 要素の追加
    numbers.add(10);  // [10]
    numbers.add(20);  // [10, 20]
    numbers.add(30);  // [10, 20, 30]
    System.out.println(numbers);

    // 要素の取得と表示
    System.out.println("LinkedListの要素:");
    for (int number : numbers) {
        System.out.println(number);
    }

    // 要素の削除
    numbers.remove();  // 先頭の要素を削除 [20, 30]
    numbers.removeLast();  // 末尾の要素を削除 [20]

    // 要素の追加（先頭に追加）
    numbers.addFirst(5);  // [5, 20]
    // 要素の追加（末尾に追加）
    numbers.addLast(25);  // [5, 20, 25]

    // 要素の取得と表示
    System.out.println("LinkedListの要素（削除・追加後）:");
    for (int number : numbers) {
        System.out.println(number);
    }

    System.out.println("");

    // Set

    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    colors.add("赤"); // 赤が重複してるので、除外される。
    System.out.println("色は" + colors.size() + "種類");

    for (String color : colors) {
    System.out.println(color);
    }

    System.out.println("");
    System.out.println("------------");

    // TreeSet; 辞書順で要素を取り出す

    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for (String s : words) {
      System.out.print(s + "→");
    }
    System.out.println("");
    System.out.println("---------");

    // HashMap
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 181);
    System.out.println(prefs);
    int tokyo = prefs.get("東京都");
    System.out.println("東京都の人口は、" + tokyo);
    // prefs.remove("京都府");
    System.out.println(prefs);
    prefs.put("熊本県", 18200000);
    int kumamoto = prefs.get("熊本県");
    System.out.println("熊本県の人口は、" + kumamoto);
    System.out.println(prefs);
    // ここからHashMapをfor文で取り出す。
    // 
    System.out.println("----ここからHashMapをfor文で取り出す-----");
    System.out.println(prefs.keySet() + "  prefs.keySet()");
    for (String key : prefs.keySet()) { // keySet()はすべてのkeyを取得する。
      int value = prefs.get(key); // つまり、for一回目のget(key)は、get("東京")
      System.out.println(key);
      System.out.println(key + "の人口は、" + value);
    }

    System.out.println("----リストに格納した勇者の名前を書き換えるが、、、-----");
    Hero j = new Hero();
    j.name = "ジュン";
    List<Hero> list = new ArrayList<Hero>();
    list.add(j);
    System.out.println(list);
    j.name = "jjjjjjjj";
    System.out.println(list.get(0).name);
    System.out.println(list);
  }
}
