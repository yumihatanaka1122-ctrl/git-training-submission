//継承の材料をnewして利用されてしまう
public class Main11_06 {
	public static void main(String[] args) {
		Character2 c = new Character2();
		Matango m = new Matango('A');
		c.attack(m);
	}
}
//作成日;2026/01/16