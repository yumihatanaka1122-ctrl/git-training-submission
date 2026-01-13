
public class Main2_4 {

	public static void main(String[] args) {
		/*Stringは二重引用符で囲まれた文字列を扱うためのデータ型
		 * profは変数名
		 * エスケープシーケンスを使用した場合
		 */
		String prof1 = "名前:朝香あゆみ\n	(あさかあゆみ)";
		//三連続の二重引用符でテキストブロックを使用した場合
		String prof2 = """
				名前:湊雄輔
					（みなとゆうすけ）
				""";
		System.out.println(prof1);
		System.out.println(prof2);

	}

}
