//API利用の例
package main;

public class Main6_10 {
	public static void main(String[] args) {
		int [] heights = {172, 149, 152, 191, 155};
		//APIの一部
		java.util.Arrays.sort(heights);
		for (int h : heights) {
			System.out.println(h);
		}
	}

}
//作成日2026/1/15