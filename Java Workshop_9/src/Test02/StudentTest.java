package Test02;

public class StudentTest {

	public static void main(String[] args) {
//		main 함수 안에서 Student 타입의 배열을 선언하여 동작 시킨다
		Student[] student = { 
				new Student("홍길동", 15, 170, 80), 
				new Student("한사람", 13, 180, 70),
				new Student("임걱정", 16, 175, 65) };

		double avgage = 0, avgheight = 0, avgweight = 0;
		String maxage = null, minage = null;
		String maxheight = null, minheight = null;
		String maxweight = null, minweight = null;
		
		System.out.println("이름 나이 신장 몸무게");
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].studentInfo());
			
			avgage += student[i].getAge();
			avgheight += student[i].getHeight();
			avgweight += student[i].getWeight();
			if (i >= 1) {
				if (student[i].getAge() > student[i-1].getAge()) {
					maxage = student[i].getName();
				}else if (student[i].getAge() < student[i-1].getAge()) {
					minage = student[i].getName();
				}
				if (student[i].getHeight() > student[i-1].getHeight()) {
					maxheight = student[i].getName();
				}else if (student[i].getHeight() < student[i-1].getHeight()) {
					minheight = student[i].getName();
				}
				if (student[i].getWeight() > student[i-1].getWeight()) {
					maxweight = student[i].getName();
				}else if (student[i].getWeight() < student[i-1].getWeight()) {
					minweight = student[i].getName();
				}
			}

		}
		System.out.println("\n나이 평군 : " + String.format("%.3f", avgage / 3.0));
		System.out.println("나이 평군 : " + String.format("%.3f", avgheight / 3.0));
		System.out.println("나이 평군 : " + String.format("%.3f", avgweight / 3.0));

		System.out.println("\n나이가 가장 많은 학생: "+maxage);
		System.out.println("나이가 가장 적은 학생: "+minage);
		System.out.println("신장이 가장 큰 학생: "+maxheight); 
		System.out.println("신장이 가장 작은 학생: "+minheight); //틀림
		System.out.println("몸무게가 가장 많이 나가는 학생 : "+maxweight); //null값 나옴
		System.out.println("몸무게가 가장 적게 나가는 학생: "+minweight);

	}

}
