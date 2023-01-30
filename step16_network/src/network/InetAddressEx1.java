package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

//도메인 : 숫자주소를 영어로 변경(DNS 서버 이용)
public class InetAddressEx1 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr1 = InetAddress.getByName("www.naver.com"); // 도메인(www.google.co.kr) 찾았는데 없을 수 있으니 오류처리
		// getByName() : 호스트가 가진 정보를 가져옴

		InetAddress addr2 = InetAddress.getLocalHost();

		System.out.println("addr1 : " + addr1.getHostName());
		System.out.println("addr1 : " + addr1.getHostAddress());

		System.out.println("addr2 : " + addr2.getHostName());// 컴퓨터의 이름
		System.out.println("addr2 : " + addr2.getHostAddress());
		// ip주소 체계 알아두면 좋음
	}
}
