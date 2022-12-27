package org.selinium;

import java.awt.AWTException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Web17FileOperation {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		File f = new File ("C:\\Users\\Windows\\workspace\\3.Dhinesh.Seleniums\\Notepad\\New.txt");
		
//		boolean fol = f.mkdir();   // folder create
//		System.out.println(fol);
//		
//		boolean fol1 = f.mkdirs();   // additional folder create
//		System.out.println(fol1);
//	
//		f.createNewFile();    // new file format create
		
//		boolean d = f.isDirectory();  // its a folder path location or not
//		System.out.println(d);
//		
//		boolean s = f.isFile();   // its a file path location or not
//		System.out.println(s);
		
		FileWriter w1 = new FileWriter(f); // file write option
		w1.write("Selinium Class Finished");
		w1.close();          // every file after write to be close
		
		FileReader r1 = new FileReader(f);  // file read option
		char[] a = new char [25];
		r1.read(a);
		
		for (char c : a) {
			System.out.print(c);  
		}           // println la ln mattum remove panna one line output varum 
		r1.close();
			
		System.out.println("Code Complete");		
	}
}
