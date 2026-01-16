//Characterを抽象クラスとして宣言する
public abstract class Character4 {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	 }
	
	 public abstract void attack(Matango m);

}
//作成日;2026/01/16