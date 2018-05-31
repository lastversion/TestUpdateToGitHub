package aboutJava;

public class AboutString {

	public static void main(String[] args) {
		
		String str = "aaa";
		String str1 = "aaa";
		//常量池
		System.out.println("str == str1 : "+(str == str1));
		
		String str2 = new String("aaa");
		String str3 = new String("aaa");
		
		System.out.println("str2 == str3 : "+(str2 == str3));
		
		String str4 = "a";
		String str5 = "aa";
		String str6 = str4 + str5;
		
		System.out.println("str == str6 : "+(str == str6));
		System.out.println("str2 == str6 : "+(str2 == str6));
		System.out.println("str.equals(str6) : "+str.equals(str6));
		System.out.println("str2.equals(str6) : "+str2.equals(str6));
		

	}

}
