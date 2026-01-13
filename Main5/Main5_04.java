//引数を1つだけ渡す
public class Main5_04 {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)