package test_01_11;

public class User {
	private String id;
	private String pw;
	private String name;
	private double point;
	public User() {
		
	}
	public User(String id, String pw, String name, double point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public double getPoint() {
		return point;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
}
