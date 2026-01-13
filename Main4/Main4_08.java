//配列を用いた点数管理プログラム(エラー)
public class Main4_08 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		//要素数は5なので0～4
		int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
		int avg = sum / scores.length;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);

	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)
