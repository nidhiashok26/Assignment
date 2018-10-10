package com.deloitte;

import java.util.Scanner;

public class PrintPyramid {

	public static void main(String[] args) {
		int k=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = scan.nextInt();
		
		int rows=r/2;
		
		for(int i=0;i<r;i++)
		{
			int count=i;
			for(k=r; k>i;k--)
				System.out.print(" ");
			
			if(count!=rows) {
				for(int j=0;j<=i;j++){
					System.out.print(" * ");
				}
			}
				else {
//					for(k=r;k>i;k--)
//						System.out.print(" ");
					for(int x=0;x<2*rows-1;x++)
						System.out.print(" *");
					
					rows += 1;
				}
			System.out.println();
			count=+1;
			}
			
		}
	}