//同じ配列を参照していることを確認する
public class Main5_13 {
	//int型配列を受け取り、
	//配列内の要素全てに1を加えるメソッド
	public static void incArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		incArray(array);
		for(int i : array) {
			System.out.println(i);
		}
	}

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)