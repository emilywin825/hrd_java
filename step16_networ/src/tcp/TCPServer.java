package tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

//사용하지 않는 포트 : 80(http), 21(ftp:파일 전송 서비스), 23(telnet:원격 로그인 서비스)

public class TCPServer {
	final static int port=7001; //100번 아래쪽은 사용x
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(port);
			System.out.println("접속대기중...");
			
			
			
			
			while(true) {
				Socket sock=ss.accept(); //접속 요청에 대한 수락
				//콘솔로 출력
			PrintStream ps=new PrintStream(System.out);
			//네트워크를 통해 들어온 데이터를 읽어 들이는 과정
			InputStream is=sock.getInputStream();
			}
		} catch (IOException e) {
			
		}	
	}
}
