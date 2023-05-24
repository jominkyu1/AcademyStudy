package array_;

public class TestClass04 {
	public static void main(String[] args) {
		String[] s = new String[3];
		double[] d = new double[3];
		
		System.out.println(s[0]==null);
		System.out.println(d[0]==0);
		/////////////////////////
		String[] s1 = {"안녕", "그래", "반갑다"};
		double[] d1 = {1.1, 2.2, 3.3};
		//for each
		for( String str : s1) {
			System.out.println(str);
		}
		for(double db : d1) {
			System.out.println(db);
		}
	}
}
