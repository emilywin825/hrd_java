package step02_연산자;

//코드 정렬 ctrl+shift+f


// . 의 의미 1. 입력 2. 포함
//1. 입력 : 어떤 함수의 실행 결과가 다음 함수의 입력으로 사용되는 경우
//2. 포함 : 클래스 또는 객체가 가지는 있는 함수

public class Parselnt {

	public static void main(String[] args) {
        String a= "100"; // 문자열은 100
        String b= "200";
        
        int a1=Integer.parseInt(a); // "100" -->100으로 변환
        int b1=Integer.parseInt(b);
         
        System.out.println(a+b); //100200 연결하기
        System.out.println(a1+b1); // 300 더하기
        
        float x=Float.parseFloat(b); // "200" --> 200.0
        double y=Double.parseDouble(b); // "200" --> 200.0
        System.out.println(x+y);
	}
}
