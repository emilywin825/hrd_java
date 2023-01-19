 package object;
//이름은 이순신이고 개발부에 근무하며 급여는 1500000원 입사성적은 87.5점입니다.

/* 사원이름 : 진달래
 * 근무부서 : 개발부
 * 받는 급여 : 1500000
 * 입사점수 : 87.5
 * */
public class ObjectEx4 {

	public static void main(String[] args) {
		Employee em=new Employee();
		em.setName("이순신");
		em.setDept("개발부");
		em.setPay(1500000);
		em.setScore(87.5);
		System.out.println(em.toString());
		em.setEmployee("진달래", "개발부", 1500000, 87.5);
		System.out.println("이름은 "+em.getName()+"이고 "+em.getDept()+"에 근무하며 급여는 "
				+em.getPay()+"원 입사성적은 "+em.getScore()+"점입니다.");
		System.out.println(em.toString());
	}

}
