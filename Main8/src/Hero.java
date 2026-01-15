//8-3 中身のない空のHeroクラスを作成
//8-4 Heroクラスに名前とHPを変数として宣言
//8-7 「眠る」操作に含まれる要素を記述
//8-8 メソッド「座る」「転ぶ」「逃げる」を追加
public class Hero {
	String name; //名前の宣言
	int hp; //HPの宣言
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した!");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った!");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ!");
		System.out.println("5のダメージ!");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
//作成日;2026/01/15