//書き換えてはいけない変数の値を上書きしてしまう
public class Main1_4 {

	public static void main(String[] args) {
		//変数に円周率を宣言
		double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie *pi);
		System.out.println("パイの半径を倍にします");
		//本来はpeiに代入
		pi = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie *pi);
		
	}

}
//作成日;2026/01/08
//最終更新日;2026/01/13(タイトル作成)
