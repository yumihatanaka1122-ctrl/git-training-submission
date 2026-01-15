//6-3 mainメソッドだけが残されたCalc.java
//6-4 正しく修正されたCalc.java
//6-5 Calcクラスをcalcapp.mainに所属させる
//6-7 別のパッケージにあるクラスを呼び出す
package main;

public class Calc{

	public static void main(String[] args) {
		int a =10; int b =2;
		int total = calcapp.Logics.CalcLogic.tasu(a,b);
		int delta = calcapp.Logics.CalcLogic.hiku(a,b);
		System.out.println("足すと" + total + "、引くと" + delta);
		

	}

}
//作成日2026/01/13　
//最終更新日;2026/01/15(タイトル作成)