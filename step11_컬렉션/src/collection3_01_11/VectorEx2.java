package collection3_01_11;

import java.util.Vector;

class Student {
	private String name;
	private double score;

	public Student() {

	}

	public Student(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(double score) {
		this.score = score;
	}

}

public class VectorEx2 {

	public static void main(String[] args) {

		Student st1 = new Student("둘리", 95.5);
		Student st2 = new Student("도우너", 85.5);
		Student st3 = new Student("마이콜", 73.3);

		Vector<Student> v = new Vector<>(); // Vector에서 v를 꺼내면 Student타입
		v.add(st1);
		v.add(st2);
		v.add(st3);

//		for(int i=0;i<v.size();i++) {
//			System.out.println("이름 : "+v.get(i).getName()+"\t");
//			System.out.println("점수 : "+v.get(i).getScore());
//		}
		// 향상된 for문
		for (Student s : v) {
			System.out.println("이름 : " + s.getName() + "\t");
			System.out.println("점수 : " + s.getScore());
		}
		// Iterator

	}

}
