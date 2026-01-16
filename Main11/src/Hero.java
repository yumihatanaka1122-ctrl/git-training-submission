//未来の開発者が作成するHeroクラス
public class Hero extends Character2{
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵に10ポイントのダメージをあたえた!");
		m.hp -= 10;
	}

}
//作成日;2026/01/16