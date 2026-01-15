//剣を装備した勇者を生み出す
public class Main9_4 {

	public static void main(String[] args) {
		//剣を生成
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		//勇者を生成
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		
		System.out.println("現在の武器は" + h.sword.name);
		
		System.out.println(h.name + "は" + h.sword.name + "で攻撃した!");

	}

}
//作成日;2026/01/15