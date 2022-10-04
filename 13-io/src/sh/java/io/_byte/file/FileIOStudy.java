package sh.java.io._byte.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileIOStudy {

	public static void main(String[] args) {
		FileIOStudy study = new FileIOStudy();
//		study.test1();
//		study.test2();
		study.test3();
		System.out.println("--- 정상 종료 ---");
	}

	/**
	 * @실습문제 : 다운로드에 있는 Stream구분.png 파일을 읽어서 프로젝트루트에 복사하기
	 * 
	 * 1.7 try with resource구문 지원
	 * - 스트림클래스 생성시, 자동으로 반환
	 */
	private void test3() {
		// 읽어올 파일명
		String filename = "C:\\Users\\user1\\Downloads\\Stream.png";
		// 생성할 파일명
		String copyFilename = "Stream.png";
		
		// BufferedInputStream 객체 생성
		// BufferedOutputStream 객체 생성
		try (
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFilename)); 
				){
			// 읽어서 쓰기
			byte[] bf = new byte[8192];
			int len = 0;
			int idx = 1;
			while((len = bis.read(bf)) != -1) {
				System.out.println(idx++ + " " + len + " " + Arrays.toString(bf));
				bos.write(bf, 0, len);
			}
			System.out.println("파일 복사 완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	/**
	 * 주스트림 + 보조스트림
	 * - FileInputStream + BufferedInputStream
	 * - FileOutputStream + BufferedOutputStream
	 */
	private void test2() {
		String filename = "helloworld.txt";
		String copyFilename = "helloworld-copy2.txt";
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null; 
		
		try {
			bis = new BufferedInputStream(new FileInputStream(filename));
			bos = new BufferedOutputStream(new FileOutputStream(copyFilename));
			
			int len = 0;
			byte[] bf = new byte[8192]; // 8kb - BufferedInputStream 내부적으로 사용하는 버퍼
			while((len = bis.read(bf)) != -1) {
				System.out.println(len + " " + Arrays.toString(bf)); // 콘솔출력
				bos.write(bf, 0, len); // 0번지부터 읽어온 마지막 번지까지 파일 출력
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * 대상인 파일인 입출력
	 * 
	 * - 상대경로(현재위치 기준으로 찾는 경로) - 자바프로그램에서는 프로젝트 루트기준
	 * - 절대경로(루트부터 시작하는 경로: C:\(윈도우), /(맥,리눅스)
	 * 
	 * 모든 스트림객체는 사용후 반납(close)해야 한다.
	 * 
	 * - 같은 파일에 대해서는 동시에 입출력하지 않는다.
	 */
	private void test1() {
//		String filename = "helloworld.txt"; // 상대경로
//		String copyFilename = "helloworld-copy.txt";
		String filename = "D:\\Workspaces\\java_workspace\\13-io\\helloworld.txt"; // 절대경로
		String copyFilename = "D:\\Workspaces\\java_workspace\\13-io\\helloworld-copy.txt";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(filename); // throws FileNotFoundException
			fos = new FileOutputStream(copyFilename, true);  // 이어쓰기 모드
			// 존재하지 않는 파일인 경우, 새로 생성.
			// 존재하는 파일인 경우, 덮어쓰기
			
			int data = 0;
			while((data = fis.read()) != -1) { // throws IOException
				System.out.println(data + " " + (char) data); // 콘솔에 출력
				fos.write(data); // 파일에 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
