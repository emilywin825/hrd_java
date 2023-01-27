package db1;

public class DBMain {

	public static void main(String[] args) {
		DBConnection db=new DBConnection();
		dbtest dt=new dbtest();
		//db.addressInsert("짱아","987-6543","일본");
		//db.addressInsert("eee","010-555-5555","독도");
		
		//데이터 수정하기
		//db.addressUpdate(2,"000-0000","백령도");
		//db.addressUpdate(3,"123-4567","제주도");
		
		//삭제하기
		//db.addressDelete(4);
		//db.addressDelete(7);
		
		//전체 목록 조회
		//db.addressList();	
		
		//--dt
		//dt.dttbInsert("짱아","357-0159","도쿄");
		//dt.dttbUpdate(5,"수지","753-9951","일본");
//		dt.dttbDelete(1);
		dt.dttbList();
	}
 }
