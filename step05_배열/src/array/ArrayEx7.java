package array;
//가변배열
public class ArrayEx7 {

	public static void main(String[] args) {
		int[][] num= new int[3][];
		num[0]=new int[]{10,20,30,40};
		num[1]=new int[]{50,60,70,80};
		num[2]=new int[]{90,100,110,120};
		
		for(int i=0;i<num.length;i++) { //num.length-->3(행의 개수)
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
 