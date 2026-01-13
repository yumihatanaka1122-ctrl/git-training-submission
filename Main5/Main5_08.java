//戻り値をそのまま使う
public class Main5_08 {

	public static int add(int x, int y){
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(add(add(10,20),add(30,40)));
	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)