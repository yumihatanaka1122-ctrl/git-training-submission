//勇者と魔法使いを生み出す
public class Main9_06 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		w.heal(h1);  //ミナトを回復させる(HP:100→110)
		w.heal(h2);  //アサカを回復させる(HP:100→110)
		w.heal(h2);  //ミナトを回復させる(HP:110→120)
		
		//確認用
		System.out.println(h1.hp);
		System.out.println(h2.hp);

	}

}
//作成日;2026/01/15