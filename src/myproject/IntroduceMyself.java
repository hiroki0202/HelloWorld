/**
 *
 */
package myproject;

import java.util.Scanner;

/**
 * 自己紹介クラス
 * @author hirokimasuda
 * 作成：2019/10/01
 */
public class IntroduceMyself {

    /**
     * メインメソッド
     * @param args
     */
    public static void main(String[] args) {

        String name = new String("増田博樹");
        int age = 20;
        int sex = 0; //0:男、1:女、2:不明

        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "才です");

        if (sex == 0) {
            System.out.println("性別は男性です");
        } else if (sex == 1) {
            System.out.println("性別は女性です");
        } else {
            System.out.println("性別は不明です");
        }

        switch (sex) {
        case 0:
            System.out.println("性別は男性です");
            break;
        case 1:
            System.out.println("性別は女性です");
            break;
        default:
            System.out.println("性別は不明です");
            break;
        }

//        practiceIf();
//        askAboutTrain();
//        practiceFor();
//        practiceBreak();
//        practiceWhile();
//        practice3_1();
//        practice3_5();
//        practice3_6();
//        show20Numbers();
//        System.out.println("平均値は" + calcAverage() + "です");
//
//        int[] score = new int[5];
////      int[] score = new int[] {0, 0, 0, 0, 0};
////      int[] score = {0, 0, 0, 0, 0};
//        showFiveScores(score);
    }

    /**
     * If練習メソッド
     * xとyの値を比較して文字列を表示する
     * @param なし
     * @return なし
     */
    private static void practiceIf() {

        int x = 1;
        int y = 2;

        if (x > y) {
            System.out.println("xはyより大きい");
        } else if (x < y) {
            System.out.println("xはyより小さい");
        } else {
            System.out.println("xとyは等しい");
        }
    }

    private static void askAboutTrain() {

        System.out.println("電車は好きですか？");
        System.out.println("1:はい");
        System.out.println("2:いいえ");

        java.util.Scanner sc = new java.util.Scanner(System.in);
        String line = sc.nextLine();

        if ("1".equals(line)) {
            System.out.println("素晴らしい");
        } else {
            System.out.println("残念です");
        }
    }

    private static void practiceFor() {

//      for (int i = 1; i < 10; i++) {
//          System.out.println(i * 3);
//      }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "回め");
        }
        System.out.println("for文終了");
    }

    private static void practiceBreak() {

        int flg = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + "回目");

            if (i == 5)  {
                flg = 1;
            }

            if (flg == 1) {
                // for文を抜ける
                break;
            }
        }
    }

    private static void practiceWhile() {

        // 無限ループ
//      int i = 0;
//      while (true) {
//          System.out.println((i+1) + "回目" + "の" + "表示結果です");
//          i++;
//      }

        int i = 1;
        int[] tensu = new int[40];

        while (i <= 40) {
            System.out.println("出席番号:" + i + "番");

            if (tensu[i] >= 80) {
                System.out.println("合格！");
            } else if (tensu[i] <= 79 && tensu[i] >= 60) {
                System.out.println("惜しい！");
            } else {
                System.out.println("論外！");
            }

            i++;
        }
        System.out.println("while文終了");
    }

    private static void practice3_1() {

        // 練習3-1
        int weight = 60;
        if (weight == 60) {
          System.out.println("weightは60です");
        }

        int age1 = 30;
        int age2 = 20;
        if ((age1 + age2) * 2 > 60) {
          System.out.println("age1とage2を足した2倍の数は60以上です");
        }

        int age = 1;
        if (age % 2 == 1) {
          System.out.println("ageは奇数です");
        }

        String name = new String("湊");
        if ("湊".equals(name)) {
          System.out.println("nameの中身は湊です");
        }
    }

    private static void practice3_5() {

        // 練習3-5
        System.out.println("[メニュー]1:検索　2:登録　3:削除　4:変更");
        Scanner sc = new Scanner(System.in);
        String selected = sc.nextLine();

        if ("1".equals(selected)) {
            System.out.println("検索します");
        } else if ("2".equals(selected)) {
            System.out.println("登録します");
        } else if ("3".equals(selected)) {
            System.out.println("削除します");
        } else if ("4".equals(selected)) {
            System.out.println("変更します");
        } else {
            // 何もしない
        }
    }

    private static void practice3_6() {

        // 練習3-6
        System.out.println("【数あてゲーム】");
        int ans = new java.util.Random().nextInt(9);
        java.util.Scanner scn = new java.util.Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("0〜9の数字を入力してください");
            String str = scn.nextLine();
            if (str.equals(String.valueOf(ans))) {
                System.out.println("あたり！");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }

    private static void show20Numbers() {

        // 10から20までの数字を順番に表示するプログラム
        for (int i = 0; i < 20; i++) {

            if (i+1 < 10) {
                // 数値が10未満の場合for文の先頭に戻る
                continue;
            }

            if ((i+1) % 2 != 0) {
                // 奇数
                System.out.println((i+1) + "(奇数)");
            } else {
                System.out.println(i+1);
            }
        }
    }

    private static int calcAverage() {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + "回目:数値を入力してください");
            sum += sc.nextInt();
        }

        sum /= 10;

        return sum;
    }

    /**
     * 点数表示メソッド
     * 5人の点数を表示する
     * @param score 5人の点数を代入するための配列
     * @return なし
     */
    private static void showFiveScores(int[] score) {

        score[0] = 10;
        score[1] = 40;
        score[2] = 70;
        score[3] = 30;
        score[4] = 55;

        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1) + "人目の点数は" + score[i] + "です");
        }
    }

}
