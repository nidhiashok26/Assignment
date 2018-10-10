package com.deloitte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JA17 {

	public static void main(String[] args) {
		File f = new File("myfile.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			for (int i =0; i < 20;i++) {
			String line= br.readLine();
			System.out.println(line);
			JA17Regex nv = new JA17Regex();
			boolean valid = nv.validate(line);
			System.out.println("Input valid:"+ valid);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {if(br!=null) br.close();}
			catch (IOException e) {}
			}
		}
		

	}

