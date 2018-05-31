package aboutJava;

public class AboutInteger {

	public static void main(String[] args) {

		Integer a = new Integer(100);
		Integer b = new Integer(100);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		Integer c = 100;
		Integer d = 100;
		//对于Integer来说有一个缓存，范围是-128--127
		System.out.println(c == d);
		System.out.println(c.equals(d));
		
		Integer e = 1000;
		Integer f = 1000;
		
		System.out.println(e == f);
		System.out.println(e.equals(f));

	}

}
