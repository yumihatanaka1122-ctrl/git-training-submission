//別のコンストラクタを呼び出す(エラー)
public class Hero5 {
	String name;
	int hp;
	Sword sword;
	
	public void attack() {
		System.out.println(this.name + "は攻撃した!");
		System.out.println("敵に5ポイントのダメージをあたえた!");
	}
	public Hero5(String name) {  //コンストラクタ①
		this.hp = 100;
		this.name = name;
	}
	public Hero5() {
		this.Hero5("ダミー");
	}

}
//作成日;2026/01/15