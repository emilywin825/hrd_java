package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class TCPClient {
	final static int port=7000; //100번 아래쪽은 사용x

	public static void main(String[] args) {
		String server_ip;
		//콘솔로 입력
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //System.in : InputStream 타입의 필드
		//콘솔로 출력
		PrintStream ps=new PrintStream(System.out);
		try {
			ps.print("접속할 ip주소를 입력하세요 : ");
			server_ip=br.readLine();
			while(true) {
				Socket sock=new Socket(server_ip,port); //접속시도
				
				//네트워크를 통해서 데이터 전송
				OutputStream os=sock.getOutputStream();
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));

				ps.println("\n전송할 메세지를 입력 : ");
				String str=br.readLine();
				
				bw.write(str,0, str.length());
				bw.flush();
				ps.println(server_ip+"에 메시지 전송: ");
				
			}			
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}

}
