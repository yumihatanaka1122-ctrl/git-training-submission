//attack()を抽象メソッドとして宣言する	
public class Character3 {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	 }
	
	 public abstract void attack(Matango m);

}
//作成日;2026/01/16