package homework0104;

public class TvTest {

	public static void main(String[] args) {
		String max=" ";
		String min=" ";
		
		Tv tvArray[]=new Tv[3]; //배열 선언
		//자료형을 클래스로 선언하면 여러가지 자료형을 한 배열에 넣을 수 있음 
		tvArray[0]=new Tv("INFINIA",1500000,"LED TV");//객체 생성1
		tvArray[1]=new Tv("XCANVAS",1000000,"LCD TV");//객체 생성2
		tvArray[2]=new Tv("CINEMA",2000000,"3D TV"); //객체 생성3
		
		for(int i=0;i<tvArray.length;i++) {
			System.out.println(tvArray[i]); 
			//tvArray[i].toString()가 디폴트 
			//그래서 toString()불러오지도 않았는데 찍히는것 
			
			if(i>0&&tvArray[i-1].getPrice()<tvArray[i].getPrice())
				max=tvArray[i].getName();
			else if(i>0&&tvArray[i-1].getPrice()>tvArray[i].getPrice())
				min=tvArray[i].getName();
		}

		System.out.println("가격이 가장 비싼 제품 : "+max);
		System.out.println("가격이 가장 저렴한 제품 : "+min);

	}	
}
