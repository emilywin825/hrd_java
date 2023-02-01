package test1;

public class test1 {
	// 메인 메소드에 인자값 던지는 방법 : Run As -> Run Configurations ->
	// Arguments->Variables->string_prompt

	public static void main(String[] args) {
		int data=Integer.parseInt(args[0]);
		System.out.println("main");
		Calc calc = new Calc();
		System.out.println(calc.calculate(data));
	}
}
