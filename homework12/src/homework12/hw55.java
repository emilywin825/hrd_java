package homework12;

import java.util.HashMap;
import java.util.Map;

class Harrypotter {
	private int num;
	private String firstname;
	private String lastname;
	public Harrypotter() { }
	public Harrypotter(int num, String firstname, String lastname) {
		this.num = num;
		this.firstname = firstname;
		this.lastname = lastname; }
	
	public int getNum() { return num; }
	public String getFirstname() { return firstname; }
	public String getLastname() { return lastname; }
	
	public void setNum(int num) { this.num = num; }
	public void setFirstname(String firstname) { this.firstname = firstname; }
	public void setLastname(String lastname) { this.lastname = lastname; }
}

public class hw55 {
	public static void main(String[] args) {
		Map<Integer,Harrypotter> hm= new HashMap<>();
		hm.put(101, new Harrypotter(101,"해리","포터"));
		hm.put(102, new Harrypotter(102,"론","위즐리"));
		hm.put(103, new Harrypotter(103,"헤르미온느","그레인져"));
		for(int i=101;i<=103;i++) {
			Harrypotter hp = hm.get(i);
			System.out.println(hp.getFirstname()+" "+hp.getLastname());
		}
	}	
}
