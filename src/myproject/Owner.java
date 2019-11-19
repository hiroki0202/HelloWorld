/**
 *
 */
package myproject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 飼い主クラス
 * @author hirokimasuda
 * 作成：2019/10/10
 */
public class Owner {

    /**
     * メインメソッド
     * @param argsß
     */
    public static void main(String[] args) {
        int numbers [] = {3,4,9};
        System.out.println("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (input == numbers[i]) {
                System.out.println("アタリ!");
            }
        }
        // ネコクラスをインスタンス化
//        Cat tama = new Cat("タマ", "スコティッシュフォールド", "茶");
//        tama.introduceMyself();
//        tama.greet();
//        tama.howl();
//        tama.eat();

        // イヌクラスをインスタンス化
        //        Dog pochi = new Dog("ポチ", "ジャーマンシェパード", "黒");
        //        pochi.introduceMyself();
        //        pochi.greet();
        //        pochi.howl();
        //        pochi.eat();

        // 多態性(ポリモーフィズム)
        //        Animal[] animals = new Animal[2];
        //        animals[0] = new Cat("タマ", "スコティッシュフォールド", "茶");
        //        animals[1] = new Dog("ポチ", "ジャーマンシェパード", "黒");
        //
        //        for (int i = 0; i < animals.length; i++) {
        //            animals[i].howl();
        //        }

        //        tama.talk("にぼし");
        //        tama.talk("クイーン", "ボヘミアン・ラプソディ");
        //        tama.talk(1000000);

        //        tama.ran();
        //        pochi.ran();

        //writeCatDiary();

//        try {
//            writeDogDiary();
//        } catch (Exception e) {
//            System.out.println("イヌ日記の書き込みに失敗しました");
//        }

//        // AnimalValue型のリストを宣言
//        List<AnimalValue> dogs = new ArrayList<AnimalValue>();
//
//        // 1匹目
//        AnimalValue pochi = new AnimalValue();
//        pochi.setName("ポチ");
//        pochi.setType("ジャーマンシェパード");
//        pochi.setColor("黒");
//        dogs.add(pochi);
//
//        // 2匹目
//        AnimalValue kuro = new AnimalValue();
//        kuro.setName("クロ");
//        kuro.setType("チワワ");
//        kuro.setColor("黒");
//        dogs.add(kuro);
//
//        // 3匹目
//        AnimalValue hachi = new AnimalValue();
//        hachi.setName("ハチ");
//        hachi.setType("しば犬");
//        hachi.setColor("茶");
//        dogs.add(hachi);
//
//        // 3匹分のデータを表示
//        for(int i = 0; i < dogs.size(); i++) {
//            AnimalValue dog = dogs.get(i);
//            System.out.println(dog.getName());
//            System.out.println(dog.getType());
//            System.out.println(dog.getColor());
//        }

        // Mapの使い方
        Map<String, String> dogs = new HashMap<>();
        dogs.put("田中", "ポチ");
        dogs.put("佐藤", "クロ");
        dogs.put("鈴木", "ハチ");

        System.out.println(dogs.get("田中"));
        System.out.println(dogs.get("佐藤"));
        System.out.println(dogs.get("鈴木"));
    }

    /**
     * ネコ日記メソッド
     * ネコの成長日記を記録する
     * @param なし
     * @return なし
     */
    public static void writeCatDiary() {

        try {
            // デスクトップのパスはOSによって異なるので注意
            FileWriter fw = new FileWriter("/Users/hirokimasuda/Desktop/cat_diary.txt");
            fw.write("ネコは今日も元気だった");
            fw.close();
        } catch (IOException e) {
            System.out.println("ネコ日記の書き込みに失敗しました");
        } finally {
            // 最後に必ず実行される処理
        }
    }

    /**
     * イヌ日記メソッド
     * イヌの成長日記を記録する
     * @param なし
     * @return なし
     * @throws IOException, NullPointerException, ArrayIndexOutOfBoundsException
     */
    public static void writeDogDiary() throws IOException, NullPointerException, ArrayIndexOutOfBoundsException {

        // デスクトップのパスはOSによって異なるので注意
        FileWriter fw = new FileWriter("/Users/hirokimasuda/Desktop/dog_diary.txt");
        fw.write("イヌは今日も元気だった");
        fw.close();
    }
}
