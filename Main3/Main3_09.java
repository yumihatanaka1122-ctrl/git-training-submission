//for文のループを二重にして九九の表を出力する
public class Main3_09 {

	public static void main(String[] args) {
		for (int i = 0; i < 10 ; i++) {
			for(int j = 0; j < 10; j++) {
				//掛け算を出力
				System.out.println(i * j);
				//空白を出力
				System.out.println(" ");
			}
			//改行を出力
			System.out.println("");
		}

	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)
