package db4;

import java.util.List;

public class EmpBiz {

	public void addressList() {//전체 테이블 검색
		EmpDao dao = new EmpDao(); 
		List<EmpEntity> list = dao.addressList();
		
		EmpView view=new EmpView();
		view.addressList(list);
	}

	public void addressInsert(EmpEntity entity) { //추가
		EmpDao dao=new EmpDao();
		int n=dao.addressInsert(entity);
		
		EmpView view=new EmpView();
		view.addressInsert(n);
	}

	public boolean addressSearch(String name) { //이름에 맞는 테이블 검색
		EmpDao dao=new EmpDao();
		EmpEntity entity=dao.addressSearch(name);
		
		EmpView view=new EmpView();
		view.addressSearch(entity);//search한 결과를 view에서 보여줌
		
		return entity!=null?true:false;	
	}

	public void addressUpdate(String name,String phone,String addr) { //이름에 맞는 테이블 수정
		EmpDao dao = new EmpDao();
		int n=dao.addressUpdate(name,phone,addr);
		
		EmpView view=new EmpView();
		view.addressUpdate(n);
		
	}

	public void addressDelete(String name) {
		EmpDao dao = new EmpDao();
		int n=dao.addressDelte(name);
		
		EmpView view=new EmpView();
		view.addressDelete(n);
	}

}
