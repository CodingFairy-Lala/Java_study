package sh.java.io._byte.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SystemIOStudy {

	public static void main(String[] args) {
		SystemIOStudy study = new SystemIOStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	
	/**
	 * 1.5 Scanner추가전의 사용자입력값처리
	 * - Scanner는 예외처리, 형변환 기능을 부가적으로 제공한다.
	 * 
	 * - 기본스트림 : 대상과 연결되는 필수스트림(필수)
	 * - 보조스트림 : 성능향상/특수한 목적을 위해 추가되는 스트림(선택). 1개이상 사용가능
	 *   - 브릿지스트림 : byte기반의 주스트림을 char기반의 보조스트림과 연결
	 *   	- InputStreamReader / OutputStreamWriter  
	 *   
	 *   
	 * **보조스트림을 사용하는 경우, 생성된 보조스트림 객체만 제어하면 된다.**
	 * 
	 * 
	 */
	private void test3() {
//		InputStream is = System.in; // 주스트림
//		InputStreamReader isr = new InputStreamReader(is); // 브릿지스트림
//		BufferedReader br = new BufferedReader(isr); // 보조스트림
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아무 글자나 입력하세요...");
		try {
			String data = null;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	/**
	 * byte[]을 사용해 read
	 * - 읽어온 byte수를 반환
	 */
	private void test2() {
		byte[] bf = new byte[256];
		int len = 0;
		System.out.println("아무 글자나 입력하세요...");
		try {
			while((len = System.in.read(bf)) != -1) {
				System.out.println(len + " " + Arrays.toString(bf));				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	/**
	 * 표준입력 System.in 사용자키보드입력
	 *   - byte기반의 입력스트림
	 *   - 입력버퍼가 비어있으면 사용자입력을 기다리는 block상태에 있다가, enter키를 누르면 buffer에서 읽어서 jvm에 전달 
	 * 표준출력 System.out 콘솔
	 * 
	 * os별 종료신호(read()의 반환값 -1)
	 * - window cmd ^c
	 * - mac/unix/linux ^d
	 * - eclipse ^z
	 */
	private void test1() {
		int data = 0;
		System.out.println("아무 글자나 입력하세요...");
		try {
			// read()는 더 이상 읽어올 데이터가 없을때 -1을 반환
			while((data = System.in.read()) != -1) {
				System.out.println(data + " " + (char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
