//円周率の定数を利用する(エラー)
public class Main1_5 {

	public static void main(String[] args) {
		//final型で円周率を定数として宣言し、値を書き換え不可にする
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		//定数を書き換えようとしたため、コンパイルエラー
		PI = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}
}
//作成日;2026/01/08
//最終更新日;2026/01/13(タイトル作成)

