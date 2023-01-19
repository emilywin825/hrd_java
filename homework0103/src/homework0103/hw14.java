package homework0103;

public class hw14 {

	public static void main(String[] args) {
		int[] random=new int[50];
		int count=0;
		int hap=0;
		for(int i=0;i<random.length;i++) {
			random[i]=(int)(Math.random()*100);
			hap+=random[i];
			System.out.print(random[i]+" ");
			count++;
			if(count%6==0) 
				System.out.println();
		}
		System.out.println();
		System.out.print("합="+hap);
	}
}
