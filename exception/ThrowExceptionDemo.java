package org.opentutorials.javatutorials.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
class B {
	void run() {
		BufferedReader bReader = null;
		String input = null;
		
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
			
		}catch(IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(input);
	}
}

*/

class B {

	void run() throws IOException, FileNotFoundException {
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}

/*
 * class C {
 * 
 * void run() { B b = new B(); try{ b.run();
 * 
 * } catch(FileNotFoundException e) { e.printStackTrace(); } catch (IOException
 * e) { e.printStackTrace(); } } }
 */

class C {

	void run() throws IOException, FileNotFoundException{
		B b = new B();
		b.run();

	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
		try{ c.run();
		
		}catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
		       
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
