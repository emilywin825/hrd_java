package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThreadMain {
	
	
	public static void main(String[] args) throws IOException {
		 EnglishLowerThread t1=new EnglishLowerThread();
         EnglishUpperThread t2=new EnglishUpperThread();
         KoreanThread t3=new KoreanThread();
         t3.start();
         try {
			t3.join();
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
         t2.start();
         try {
			t2.join();
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         t1.start();
         
         
	}

}
