//別のコンストラクタを呼び出す
public class Hero6 {
	String name;
	int hp;
	Sword sword;
	
	public void attack() {
		System.out.println(this.name + "は攻撃した!");
		System.out.println("敵に5ポイントのダメージをあたえた!");
	}
	
	public Hero6(String name) { //コンストラクタ①
		this.hp = 100;
		this.name = name;
	}
	
	public Hero6() {  //コンストラクタ②
		//コンストラクタ①を引数を渡して呼び出している
		this("ダミー");
	}

}
//作成日;2026/01/15