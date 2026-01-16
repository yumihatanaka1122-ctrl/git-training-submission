//コンストラクタの動作を確認する
public class SuperHero6 extends Hero3 {
	boolean flying;
	
	public SuperHero6() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった!");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}
	public void run() {
		System.out.println("撤退した");
	}
	
	public void attacl(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
			
		}
	}

}
//作成日;2026/01/16
