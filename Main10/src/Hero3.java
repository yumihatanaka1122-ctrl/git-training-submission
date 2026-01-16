//コンストラクタの動作を確認する
public class Hero3 {
	String name = "ミナト";
	int hp =100;
	
	public Hero3() {
		System.out.println("Heroのコンストラクタが動作");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた!");
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ!");
		System.out.println("5のダメージ");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した!");
	}

}
//作成日;2026/01/16