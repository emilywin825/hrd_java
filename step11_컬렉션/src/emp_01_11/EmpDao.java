package emp_01_11;

import java.util.ArrayList;
import java.util.List;

//DAO:DB에 접근하는 객체
//데이터 베이스에서 데이터를 가지고 오거나 저장하는 용도로 사용하는 객체

public class EmpDao {
	List<EmpVo> list=null;
	
	public EmpDao() {
		list=new ArrayList<>();
		list.add(new EmpVo("뽀로로","개발부",1000000));
		list.add(new EmpVo("크롱","영업부",2000000));
		list.add(new EmpVo("패티","개발부",1000000));
	}
	
	public List<EmpVo> getEmpList(){
		return list;
	}

	public EmpVo getEmp(String name) {
// 1,2 같은 표현
//------------------------------------------2.
		for(EmpVo vo : list) {
			if(vo.getEname().equals(name))
			return vo;
	}
	return null;
//------------------------------------------1.		
//		EmpVo vo=null;
//		for(EmpVo vo2 : list) {
//			if(vo2.getEname().equals(name))
//				vo=vo2;
//		}
//		return vo;
	}
}
