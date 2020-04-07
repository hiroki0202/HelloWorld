/**
 *
 */
package myproject;

/**
 * Hello World!!表示
 * @author
 */
public class HelloWorld {

	/**
	 * メインメソッド
	 * @param args
	 */
	// 元のメソッドはコメントアウト
	// public static void main(String[] args) {
	//     // コンソールに「Hello World!!」の文字列を表示します
	//     System.out.println("Hello World!!");
	// }

	// 標準出力するプログラムのテストは文字列を返すメソッドを分ける
	public static void main(String[] args) {
		System.out.println(makeMessage());
	}

	static String makeMessage() {
		return "Hello World!!";
	}
}
