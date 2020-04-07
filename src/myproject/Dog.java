/**
 *
 */
package myproject;

/**
 * イヌクラス
 * @author hirokimasuda
 * 作成：2019/10/10
 */
public class Dog extends Animal {

    /**
     * コンストラクタ
     * フィールドの初期値を設定する
     * @param name
     * @param type
     * @param color
     */
    public Dog(String name, String type, String color) {

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

        System.out.println("我輩はイヌである。名前は" + super.animalValue.getName() + "、"
                + super.animalValue.getColor() + "色の" + super.animalValue.getType() + "である。");
        this.bite();
    }

    /**
     * かみつくメソッド
     * かみついて攻撃する
     * @param なし
     * @return なし
     */
     private void bite() {

        System.out.println("かみつくわん！");
    }

    /**
     * 鳴くメソッド
     * 犬の鳴き声を出す
     * @param なし
     * @return なし
     */
    public void howl() {

        System.out.println("がるる！");
    }

    /**
     * 食べるメソッド
     * ドッグフードを食べる
     * @param なし
     * @return なし
     */
    @Override
    public void eat() {

        System.out.println("ドッグフードを食べるにゃん！");
    }
}
