//Characterを継承して定義されたWizardクラス
public abstract class Character {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m);

}
//作成日;2026/01/16