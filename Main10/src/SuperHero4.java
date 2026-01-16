//attack()をオーバーライドしたSuperHero
public class SuperHero4 extends Hero{
	boolean flyaing;
	
	public void fly() {
		this.flyaing = true;
		System.out.println("飛び上がった!");
	}
	
	public void land() {
		this.flyaing = false;
		System.out.println("着地した!");
	}
	
	public void run() {
		System.out.println("撤退した");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp -=5;
		System.out.println("5ポイントのダメージをあたえた!");
		if (this.flyaing) {
			System.out.println(this.name + "の攻撃!");
			m.hp -= 5;
			System.out.println("5ポイントのダメージをあたえた!");
		}
	}

}
//作成日;2026/01/16