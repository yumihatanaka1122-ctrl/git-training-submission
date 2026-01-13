//50点以上の科目の数を調べる
public class Main4_11 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は:" + count);

	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)
