//仮想世界に勇者とお化けキノコを2匹生み出す
public class Main2 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		
		Metango m1 =new Metango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Metango m2 = new Metango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();

	}

}
//作成日;2026/01/15