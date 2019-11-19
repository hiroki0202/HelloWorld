/**
 *
 */
package myproject;

/**
 * 動物クラス
 * @author hirokimasuda
 * 作成：2019/10/10
 */
public abstract class Animal implements Creature {

    /** 動物バリュー */
    protected AnimalValue animalValue;

    /**
     * 動物あいさつ
     * 動物のあいさつをする
     * @param なし
     * @return なし
     */
    public void greet() {
        System.out.println("アニマル！");
    }

    /**
     * 鳴くメソッド
     * 鳴く
     * @param なし
     * @return なし
     */
    public abstract void howl();

    /**
     * 逃げるメソッド
     * 逃げる
     * @param なし
     * @return なし
     */
    public void ran() {

        System.out.println("にげろ！");
    }
}
