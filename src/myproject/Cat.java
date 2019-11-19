/**
 *
 */
package myproject;

/**
 * ネコクラス
 * @author hirokimasuda
 * 作成：2019/10/10
 */
public class Cat extends Animal {

    private final String species = new String("ネコ");

    /**
     * コンストラクタ
     * フィールドの初期値を設定する
     * @param name
     * @param type
     * @param color
     */
    public Cat(String name, String type, String color) {

        super.animalValue = new AnimalValue();
        super.animalValue.setName(name);
        super.animalValue.setType(type);
        super.animalValue.setColor(color);
    }

    /**
     * 自己紹介
     * 自己紹介する
     * @param なし
     * @return なし
     */
    public void introduceMyself() {

        System.out.println("我輩は" + this.species + "である。名前は" + super.animalValue.getName() + "、"
                + super.animalValue.getColor() + "色の" + super.animalValue.getType() + "である。");
        this.scratch();
    }

    /**
     * ひっかく
     * 爪でひっかいて攻撃する
     * @param なし
     * @return なし
     */
     private void scratch() {

        System.out.println("ひっかくにゃん！");
    }

    /**
     * 鳴くメソッド
     * 猫の鳴き声を出す
     * @param なし
     * @return なし
     */
    public void howl() {

        System.out.println("にゃーん！");
    }

    /**
     * 食べるメソッド
     * キャットフードを食べる
     * @param なし
     * @return なし
     */
    @Override
    public void eat() {

        System.out.println("キャットフードを食べるにゃん！");
    }

    /**
     * 喋るメソッド1
     * 好きな食べ物について喋る
     * @param food 好きな食べ物
     * @return なし
     */
    public void talk(String food) {

        System.out.println("食べ物は" + food + "が好きだにゃん");
    }

    /**
     * 喋るメソッド2
     * 好きな音楽について喋る
     * @param group 好きなグループ、song 好きな曲
     * @return なし
     */
    public void talk(String group, String song) {

        System.out.println("好きな音楽は" + group + "の" + song + "だにゃん");
    }

    /**
     * 喋るメソッド3
     * 自分の年齢について喋る
     * @param age 年齢
     * @return なし
     */
    public void talk(int age) {

        System.out.println("実は" + age + "才なんだにゃん");
    }

    /**
     * 逃げるメソッド
     * 逃げる
     * @param なし
     * @return なし
     */
    public void ran() {

        System.out.println("にげるにゃん！");
    }
}
