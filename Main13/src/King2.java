//13-7 王様クラスで利用されているnameフィールド
//13-9 talk()でgetNameを呼び出す
public class King2 {
	void talk(Hero h) {
	    System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ。");
	    System.out.println("王様：長旅疲れたであろう。");
	    System.out.println("王様：まずは城下町を見てくるとよい。ではまた会おう。");
	    h.bye();
	    //︙
	  }

}
//作成日;2026/01/16