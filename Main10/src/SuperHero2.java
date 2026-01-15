//Heroクラスを継承してSuperHeroを作成する
public class SuperHero2 extends Hero{
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった!");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}

}
//作成日;2026/01/15