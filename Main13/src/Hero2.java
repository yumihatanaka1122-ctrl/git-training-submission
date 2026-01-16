//13-4 hpフィールドをprivateにしたHeroクラス 
//13-5 dieメソッドをprivateにする
//13-6 attackメソッドはpublicにする
//13-8 HeroクラスにgetNameメソッドを追加
//13-10 Heroクラスにsetterメソッド
public class Hero2 {
	private int hp;
	String name;
	Sword sword;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name =name;
	}
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	  }
	private void die() {
	    System.out.println(this.name + "は死んでしまった!");
	    System.out.println("GAME OVERです。");
	  }
	public void sleep() {
	    this.hp = 100;
	    System.out.println(this.name + "は眠って回復した!");
	  }
	public void attack(Matango m) {
	    System.out.println(this.name + "の攻撃!");
	    //︙
	    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
	    this.hp -= 2;
	    if (this.hp <= 0 ) {
	      this.die();
	    }
	  }
	  //︙

}
//作成日;2026/01/16