
public class Main5_06 {

	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		add();
	}
	public static void add() {
		//コンパイルエラー。ブロックが違うため変数の有効範囲を出ている
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}
