package sh.java.io.file;

import java.io.File;

public class FileStudy {

	public static void main(String[] args) {
		FileStudy study = new FileStudy();
		study.test1();
	}

	/**
	 * java.io.File
	 * - 실제 파일을 가리키는 자바객체
	 */
	private void test1() {
		File file = new File("helloworld.txt");
		System.out.println(file.exists()); // true
		System.out.println(file.getPath()); // helloworld.txt
		System.out.println(file.getAbsolutePath()); // D:\Workspaces\java_workspace\13-io\helloworld.txt
		
		File foo = new File("foo");
		System.out.println(foo.exists());
		foo.mkdir(); // make directory
		System.out.println(foo.exists());
		System.out.println(foo.isDirectory());
		
		File kar = new File("foo/bar/too/kar");
		System.out.println(kar.exists());
		kar.mkdirs();
		System.out.println(kar.exists());
		
		
		File destFile = new File("foo/bar/too/kar/helloworld.txt");
		file.renameTo(destFile); // 이동 
		System.out.println(file.exists());
		System.out.println(destFile.exists());
		
	}

}
