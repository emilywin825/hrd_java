package array;
//2차원 배열
public class ArrayEx6 {

	public static void main(String[] args) {
		int[][] num= {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120}
		};
		for(int i=0;i<num.length;i++) { //num.length-->3(행의 개수)
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
