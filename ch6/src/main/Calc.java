
public class Calc
{

	public static void main(String[] args) {
		int a =10; int b =2;
		//分割により呼び出す先がない
		int total = calcapp.Logics.CalcLogic.tasu(a,b);
		int delta = calcapp.Logics.CalcLogic.hiku(a,b);
		System.out.println("足すと" + total + "、引くと" + delta);
		

	}

}
