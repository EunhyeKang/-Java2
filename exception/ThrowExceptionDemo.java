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
class B{
	
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input); 
    }
}


class C {

	void run() {
		B b = new B();
		try{ b.run();
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
		c.run();
	}
}
