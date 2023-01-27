package db4;

import java.util.List;

public class EmpBiz {

	public void addressList() {
		EmpDao dao = new EmpDao();
		List<EmpEntity> list = dao.addressList();
		
		EmpView view=new EmpView();
		view.addressList(list);
	}

	public void addressInsert(EmpEntity entity) {
		EmpDao dao=new EmpDao();
		int n=dao.addressInsert(entity);
		
		EmpView view=new EmpView();
		view.addressInsert(n);
	}

	public boolean addressSearch(String name) {
		EmpDao dao=new EmpDao();
		EmpEntity entity=dao.addressSearch(name);
		
		EmpView view=new EmpView();
		view.addressSearch(entity);//search한 결과를 view에서 보여줌
		
		return entity!=null?true:false;	
	}

}
