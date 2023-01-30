package stringex_01_11;

public class StringEx {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "programming";

		String s3 = s1.concat(s2); // a.concat(b)-->a+b
		String s4=s3.substring(5,12); //12보다 한칸 앞까지 출쳑
		String s5=s3.substring(5);
		String s6=s3.toUpperCase(); //모두 대문자로
		char s=s3.charAt(5);//해당 인덱스의 문자 return
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s);
	//---------------------------------------------------
		
		String str1="hello";
		String str2="hello";
		String str3=str2;
		
		System.out.println(str1==str2);//true
		System.out.println(str1==str3);//true
		
		String str4=new String("hello");
		String str5=new String("hello");
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//true

		System.out.println(str4==str5);//false
		System.out.println(str4.equals(str5));//true
		
	}

}
