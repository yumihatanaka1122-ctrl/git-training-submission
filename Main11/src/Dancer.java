//抽象メソッドのオーバーライド忘れ(エラー)
public class Dancer extends Character4 {
	public void damce() {
		System.out.println(this.name + "は情熱的に踊った");
	}

}
//作成日;2026/01/16