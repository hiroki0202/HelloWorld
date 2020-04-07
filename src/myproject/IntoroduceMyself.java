package myproject;

/**
 * 自己紹介クラス
 * 自己紹介文をコンソールに出力する
 * @author hirokimasuda
 */
public class IntoroduceMyself {

	/**
	 * メイン
	 * メインメソッド
	 * @param args
	 */
	public String introduce(int age) {

		// 自分の名前を表示する
		// System.out.println("私の名前は増田博樹です");

		//        int i;
		//        for (i = 0; i < 3; i++) {
		//            System.out.println("私の名前は増田博樹です");
		//            System.out.println("好きな食べ物はりんごです");
		//
		//            if(i == 0) {
		//                continue;
		//            }
		//
		//            System.out.println("好きな音楽はJ-POPです");
		//            System.out.println("よろしくお願いします。");
		//        }

		//        int j = 0;
		//        while(true) {
		//            System.out.println("私の名前は増田博樹です");
		//            j++;
		//
		//            if (j == 10) {
		//               break;
		//            }
		//        }

		//        String name = new String("増田博樹");
		//        System.out.println("私の名前は" + name);
		//
		//        int age = 40;
		//        System.out.println("年齢は" + age + "歳です");
		//
		//        if (name.equals("増田博樹") && age == 33) {
		//            System.out.println("私の名前は湊です");
		//        } else {
		//            System.out.println("私の名前は湊ではありません");
		//        }

		switch (age) {
		case 10:
			return "私の年齢は10歳です";
		case 20:
			return "私の年齢は20歳です";
		case 30:
			return "私の年齢は30歳です";
		default:
			return "私の年齢はそれ以外です";
		}
	}
}
