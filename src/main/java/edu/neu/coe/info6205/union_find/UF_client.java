package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class UF_client {
	public static void main(String[]args) {
		int n=16000;
		int m=100;
		int a=0;
		int b=0;
		int d=0;
		for (int  c= 0; c< m ; c++) {
			
			Random random=new Random();
			a=random.nextInt(n);
			b=random.nextInt(n);
			UF_HWQUPC UF = new UF_HWQUPC(n,true);
			while (UF.components() > 1) {
				a= random.nextInt(n);
				b= random.nextInt(n);
				while (a ==b) {
					a= random.nextInt(n);
					b= random.nextInt(n);
				}
				UF.connect(a,b);
				d++;

				}
			}
		System.out.println(d/m);
		}

	}


