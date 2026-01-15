//Sword型フィールドを持つHeroクラス

//次にHeroクラスを定義する
public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は攻撃した!");
		System.out.println("敵に5ポイントのダメージをあたえた!");
	}

}
//作成日;2026/01/15