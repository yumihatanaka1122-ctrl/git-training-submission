//Monsterなら何でも攻撃できるattackメソッド
public class Hero2 extends Character{
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵に10ポイントのダメージをあたえた!");
		m.hp -=10;
	}


}
//作成日;2026/01/16