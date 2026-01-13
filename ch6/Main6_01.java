//計算機プログラム
public class Main6_01 {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = tasu(a, b);
		int delta = hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	public static int tasu(int a, int b) {
		return (a + b);
	}
	public static int hiku(int a, int b) {
		return (a - b);
	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)