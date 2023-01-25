package db1;

public class DBMain {

	public static void main(String[] args) {
		DBConnection db=new DBConnection();
		
		//전체 목록 조회
		db.addressList();
	}

}
