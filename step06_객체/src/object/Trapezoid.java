 package object;
/*
 * -base:int
 * -top:int
 * -height:int
 * 
 * +setTrapezoid(base:int, top:int,height:int):void
 * +calc():double <==사다리꼴의 넓이를 구해서 리턴
 * +toString():String 
*/
//사다리꼴의 넓이 = (아랫변+윗변)*높이/2
public class Trapezoid {
	private int base;
	private int top;
	private int height;
	
	public int getBase() {
		return base;
	}

	public int getTop() {
		return top;
	}

	public int getHeight() {
		return height;
	}
 
	public void setBase(int base) {
		this.base = base;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void setHeight(int height) {
		this.height = height;
	}	
	public void setTrapezoid(int base, int top, int height) {
		this.base=base;
		this.top=top;
		this.height=height;
	}
	
	public double calc() {
		return (base+top)*height/2.0;
	}
	//toString():출력 문장 만들기 (객체 정보 출력)
	public String toString() {
		return "사다리꼴의 넓이는 "+calc()+"입니다.";
	}
} 
