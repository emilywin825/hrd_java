 package object;
/*
 * 클래스명 : Sales
 * -item : String
 * -qty : int
 * =cost : int
 * 
 * +getter & setter
 * 
 * +toString():String <==출력문
 * +getPrice():int <==수량*단가
*/

class Sales{
	private String item;
	private int qty;
	private int cost;
	
	public String getItem() {
		return item;
	}
	public int getQty() {
		return qty;
	}
	public int getCost() {
		return cost;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "품목 : "+item+"\n수량 : "+qty+"\n단가 : "+cost+"\n금액 : "+getPrice();
	}
	public int getPrice() {
		return qty*cost;
	}
}

public class ObjectEx5 {
	
	public static void main(String[] args) {
		Sales ob=new Sales();
		ob.setItem("apple");
		ob.setQty(5);
		ob.setCost(1200);
		
		System.out.println(ob.toString());
		System.out.println(ob.getItem()+" "+ob.getCost()+"원짜리 "+ob.getQty()+"개를 구입하려면 "+ob.getPrice()+"원이 필요함");
		//apple 1200원짜리 5개를 구입하려면 6000원이 필요함
	}

}
