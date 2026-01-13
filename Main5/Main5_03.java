//mainメソッド以外からメソッドを呼び出す
public class Main5_03 {

	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		methodA();
	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)