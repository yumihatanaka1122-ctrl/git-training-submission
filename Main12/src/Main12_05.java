//MonsterとSlimeの逃げ方を調べる
public class Main12_05 {

	public static void main(String[] args) {
		//型（箱）は違くとも、呼び出す中身は同じなので
		//スライムの挙動のみが現れる
		Slime s = new Slime();
		Monster m = new Slime();
		s.run(); m.run();

	}

}
//作成日;2026/01/16