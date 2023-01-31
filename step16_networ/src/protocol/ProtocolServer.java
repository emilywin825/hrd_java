package protocol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//100:아이디
//200:아이디
//300:아이디:메시지
//200:아이디

//server먼저 실행 후 client 실행

public class ProtocolServer {
	// 소켓
	ServerSocket ss = null;
	Socket sock = null;
	BufferedReader br = null;
	BufferedWriter bw = null;

	public ProtocolServer() throws IOException {
		ss = new ServerSocket(7000);
		System.out.println("접속 대기중...");
		sock = ss.accept(); // 응답

		// sock과 연결되는 스트림
		br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
		while(true) {
			//보낸 D 읽어옴
			String buf=br.readLine();
			String[] words=buf.split(":"); //읽어온 문자열을 구분자(:)로 분리
			
			if(words[0].equals(Protocol.ENTER)) { //입장
				enter(words);		
			}else if(words[0].equals(Protocol.EXIT)) {
				exit(words);
			}else if(words[0].equals(Protocol.SENT_MESSAGE)) {
				sendMessage(words);
			}else if(words[0].equals(Protocol.SECRET_MESSAGE)) {
				secretMessage(words);
			}else  {
				bw.write("잘못된 요청입니다"); bw.flush();
			}
		}
	}
	
	private void secretMessage(String[] words) {
		//400:뽀로로:크롱:안녕
		//[뽀로로]가 [크롱]에게 귓속말 보냄
		//[뽀로로] 안녕
		System.out.println("["+words[1]+"]가"+words[2]+"에게 귓속말 보냄\n");
		System.out.println("["+words[1]+"]가"+words[3]);
	}
	

	private void sendMessage(String[] words) {
		//300:뽀로로:안녕
		System.out.println("["+words[1]+"]"+words[2]+"\n");
	}

	private void exit(String[] words) {
		//200:뽀로로
		System.out.println("["+words[1]+"]님이 퇴장하셨습니다\n");
	}

	public void enter(String[] words) {
		//100:뽀로로 //100:0번째 방, 뽀로로:1번째 방
		System.out.println("["+words[1]+"]님이 입장하셨습니다\n");
	}
	

	public static void main(String[] args) throws IOException {
		new ProtocolServer();
	}
}
