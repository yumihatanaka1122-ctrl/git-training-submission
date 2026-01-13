//複数の引数を渡す
public class Main5_05 {

	public static void main(String[] args) {
		add(100, 20);
		add(200, 50);
	}
	//複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans );
	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)