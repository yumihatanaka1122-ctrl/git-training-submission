//8-10 「神様のクラス」を作る
//8-11 勇者インスタンスを生成
//8-12 勇者インスタンスを生成して初期値を代入
//8-13 仮想世界に勇者を生み出すプログラム
public class Main {

	public static void main(String[] args) {
		//1.勇者を生成
		Hero h = new Hero();
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました!");
		//勇者のメソッドを呼び出していく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}

}
//作成日;2026/01/15　