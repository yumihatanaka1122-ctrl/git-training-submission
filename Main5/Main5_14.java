//戻り値が配列の場合
public class Main5_14 {

	public static int [] makeArray(int size) {
		int[] newArray = new int[size];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;

	}
	public static void main(String[] args) {
		int[] array =makeArray(3);
		for(int i : array) {
			System.out.println(i);
		}
	}	

}
//作成日2026/01/13
//最終更新日;2026/01/13(タイトル作成)