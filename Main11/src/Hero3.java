//オーバーライドしたつもりのHeroクラス
public class Hero3 extends Character2{
	public void atack(Matango m) {
	    System.out.println(this.name + "の攻撃!");
	    System.out.println("敵に10ポイントのダメージをあたえた!");
	    m.hp -= 10;
	  }
}
//作成日;2026/01/16