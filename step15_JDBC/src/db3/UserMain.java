package db3;

import java.sql.SQLException;
import java.util.List;

public class UserMain {

	public static void main(String[] args) throws SQLException {
		UserDao dao=new UserDao();
		//데이터 추가하기 -> Statement로 작성
		int n=dao.insertUser(new UserEntity("jj","0000","짱구",12));
//		UserEntity entity=new UserEntity("maenggu","1234","맹구",56.5);
//		int n=dao.insertUser(entity1);
		if(n>0) System.out.println(n+"건의 데이터가 추가 되었습니다.");
		else System.out.println("데이터 추가에 실패");

		//전체보기
		List<UserEntity> list=dao.userList(); //->리스트가 넘어옴
		
		for(UserEntity entity:list) {//리스트를 반복해서 출력해줌
			System.out.print(entity.getNum()+"\t");
			System.out.print(entity.getId()+"\t");
			System.out.print(entity.getPasswd()+"\t");
			System.out.print(entity.getName()+"\t");
			System.out.print(entity.getScore()+"\n");
		}
		
		//bb의 모든 데이터를 출력
//		UserEntity entity = dao.selectUser("bb");
//		System.out.print(entity.getNum() + "\t");
//		System.out.print(entity.getId() + "\t");
//		System.out.print(entity.getPasswd() + "\t");
//		System.out.print(entity.getName() + "\t");
//		System.out.print(entity.getScore() + "\n");

	
	}
}
