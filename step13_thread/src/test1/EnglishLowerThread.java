package test1;

public class EnglishLowerThread extends Thread{
	   char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
               'o','p','q','r','s','t','u','v','w','x','y','z'};
	   @Override
		public void run() {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
}
