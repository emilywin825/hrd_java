package test1;

public class test1 {
	// 메인 메소드에 인자값 던지는 방법 : Run As -> Run Configurations ->
	// Arguments->program arguments->string_prompt로 지정

	public static void main(String[] args) {
		int data=Integer.parseInt(args[0]);
		Calc calc = new Calc();
		int i=calc.calculate(data);
		if(i!=-1) {
		System.out.println(i);
		}
	}
}
