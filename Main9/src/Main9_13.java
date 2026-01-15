//コンストラクタをオーバーロードしたクラスの利用
public class Main9_13 {

	public static void main(String[] args) {
		//引数がある
		Hero4 h1 = new Hero4("ミナト");
		System.out.println(h1.name);
		
		//引数がない
		Hero4 h2 = new Hero4();
		System.out.println(h2.name);

	}

}
//作成日;2026/01/15