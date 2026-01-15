//コンストラクタで引数を追加情報として受け取る
public class Hero3 {
	String name;
	int hp;
	Sword sword;
	
	public void attack() {
		System.out.println(this.name + "は、攻撃した!");
		System.out.println("敵に5ポイントのダメージをあたえた!");	
	}
	
	public Hero3(String name) {
		this.hp = 100;
		this.name = name;  //引数の値でnameフィールドを初期化
	}

}
//作成日;2026/01/15