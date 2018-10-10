package com.deloitte;
import java.util.Random;

public class Random10 {

		public static void main(String[] args) {
			String[] article = {"the", "a",  "one", "some" };
			String[] noun ={"boy", "girl", "dog", "town", "car"};
			String[] verb ={"drove", "jumped", "ran", "walked", "skipped"};
			String[] preposition ={"to", "from", "over", "under", "on"};
			for(int i=0; i<20; i ++ ) {
			int s1 = new Random().nextInt(4);
			int s2 = new Random().nextInt(5);
			int s3 = new Random().nextInt(5);
			int s4 = new Random().nextInt(5);
			int s5 = new Random().nextInt(4);
			int s6 = new Random().nextInt(5);
			String str = article[s1];
			String capital = str.substring(0,1).toUpperCase()+str.substring(1);
			System.out.println(capital + " " + noun[s2] + " " + verb[s3] + " " + preposition[s4] + " " + article[s5] + " " + noun[s6] + "." );
			}

		}

	}


