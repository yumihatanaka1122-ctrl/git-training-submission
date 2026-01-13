//伝統的なswitch文の利用
public class Main3_06 {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune){
			case 1,2:
				System.out.println("いいね!");
				break;
			case 3:
				System.out.println("普通です");
				break;
			case 4,5:
				System.out.println("う～ん…");
			
			
		}

	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)
