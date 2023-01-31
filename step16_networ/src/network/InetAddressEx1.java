package network;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.net.UnknownHostException;

//도메인 : 숫자주소를 영어로 변경(DNS 서버 이용)
public class InetAddressEx1 {
//InetAddress : 로컬 컴퓨터의 IP 주소, 도메인 이름 DNS에서 검색하고 IP주소 가져오는 기능 제공
	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		InetAddress addr1 = InetAddress.getByName("www.naver.com"); // 도메인(www.google.co.kr) 찾았는데 없을 수 있으니 오류처리
		// getByName() : 호스트가 가진 정보를 가져옴
		System.out.println("addr1 : " + addr1.getHostName());
		System.out.println("addr1 : " + addr1.getHostAddress());
		
		InetAddress addr2 = InetAddress.getLocalHost(); //로컬 컴퓨터의 InetAddress
		System.out.println("addr2 : " + addr2.getHostName());// 컴퓨터의 이름
		System.out.println("addr2 : " + addr2.getHostAddress());
		// ip주소 체계 알아두면 좋음
		
		URL url=new URL("http://127.0.0.1");//URL 객체
		System.out.println("protocol : "+url.getProtocol());
		System.out.println("port : "+url.getPort());
		
		InetAddress ia=InetAddress.getByName("www.naver.com");
		System.out.println(InetAddress.getLocalHost());
	} 
}
