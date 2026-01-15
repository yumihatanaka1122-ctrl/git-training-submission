//生まれた直後の動作を定義したHero
public class Hero2 {

	String name;
	int hp;
	Sword sword;
		
	public void attack() {
		System.out.println(this.name + "は攻撃した!");
		System.out.println("敵に5ポイントのダメージをあたえた!");
		}
	public Hero2() {
		this.hp = 100;  //hpフィールドを100で初期化
	}

}
