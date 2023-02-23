package dto;

public class LoginDTO {
	private String userid;
	private String userpwd;
	
	public LoginDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public LoginDTO(String userid, String userpwd) {
		super();
		this.userid = userid;
		this.userpwd = userpwd;
	}

	public String getUserid() {
		return userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	
	
	
	
	
}
