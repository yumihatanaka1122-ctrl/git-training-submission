//SuperHeroクラスにrun()を再定義する
public class SuperHero3 extends Hero{
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった!");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}
	public void run() {
		System.out.println(this.name + "は撤退した");
	}

}
//作成日;2026/01/15