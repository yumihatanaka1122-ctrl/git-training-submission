
public class Main3_05 {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
			//fortuneが1か2なら
			case 1,2 -> {
				System.out.println("いいね！");
			}
			//3なら
			case 3 -> {
				System.out.println("普通です");
			}
			//4か5なら
			case 4,5 -> {
				System.out.println("う～ん…");
			}
		}

	}

}
//作成日2026/01/13
