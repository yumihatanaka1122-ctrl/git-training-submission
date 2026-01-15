//calcapp.logics.CalcLogicをインポートする
package main;
import calcapp.Logics.CalcLogic;

public class Calc2 {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = calcapp.Logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
		

	}

}
//作成日2026/1/15