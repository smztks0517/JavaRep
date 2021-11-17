package myPkg;

public class myclass1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 1;
		int b = 1;

		//テストコメント
		//System.out.println("前置だと" + ++a + "になります。");
		System.out.println("後置だと" + b++ + "になります。");
		System.out.println("テスト");
		
		// CMNT 各変数型の宣言
		byte bytea = 127;
		short shorta = 1000;
		float floata = 127.5F;
		double doublea = 0.5;

		// CMNT 型変換用の変数の宣言
		int casta;

		// CMNT 型変換した変数の出力
		casta = (int) bytea;
		System.out.println("byte型の変換：" + casta);

		casta = (int) shorta;
		System.out.println(casta);

		casta = (int) floata;
		System.out.println(casta);

		casta = (int) doublea;
		System.out.println(casta);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void testMethod(String[] args) {
		System.out.println("こんにちは");
	}

}
