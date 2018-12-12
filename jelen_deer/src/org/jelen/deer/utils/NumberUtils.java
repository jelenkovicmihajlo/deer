package org.jelen.deer.utils;

import java.util.Random;

public class NumberUtils {
	public static int max(int a,int b) {
		int vbr=0;
		if(a>b) {
			vbr=a;
		}else{
			vbr=b;
		}
		return vbr;
	}
	public static int min(int a,int b) {
		int mbr=0;
		if(a>b) {
			mbr=b;
		}else{
			mbr=a;
		}
		return mbr;
	}
	public static int  MakeRandBr() {
		Random rand = new Random();
		int br=rand.nextInt(99);
		return br;
	}
}
