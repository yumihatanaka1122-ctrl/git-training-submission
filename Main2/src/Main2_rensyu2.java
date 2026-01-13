
public class Main2_rensyu2 {

	public static void main(String[] args) {
		//①× intは小数点のない数字
		int x = 3 + 5.0;
		
		//②△　小数点が付きFで終わるのはfloat型。代入可
		double d = 2.0F;
		
		//③×　二重引用符で括られているので文字列の扱い
		int number = "5";
		
		//④〇　
		String s = 2 + "人目";
		
		//⑤〇
		byte b = 1;
		
		//⑥×
		double d = ture;
		
		//⑦〇
		short s = (byte)2;

	}

}
//作成日2026/01/13