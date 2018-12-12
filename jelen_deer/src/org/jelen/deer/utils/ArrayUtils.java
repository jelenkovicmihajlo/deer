package org.jelen.deer.utils;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

	public static int maxNoInd(int[] x, int N) {
		int maxnam=0;
		int maxindex=0;
		for(int i=0;i<N;i++) {
			if(maxnam<x[i]) {
				maxindex=i;
				maxnam=x[i];
			}
		}
		return maxindex;
	}
	public static void printniz(int[] x) {
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]);
			System.out.print(",");
		}
		System.out.println();

	}
	public static int[]  MakeNizFromUser() {
		Scanner reader = new Scanner(System.in);
		System.out.print("unesi velicinu niza");
		int N=0;
		N=reader.nextInt();
		System.out.print("unesi clanove niza");
		int[] niz=new int[N];
		for(int i=0;i<N;i++) {
			niz[i]=reader.nextInt();
		}
		reader.close();
		return niz;
	}
	public static int[]  MakeRandArray(int dim) {
		return MakeRandArray(dim, 99);
	}
	public static int[]  MakeRandArray(int dim, int maxno) {
		int N=dim;
		int[] niz=new int[N];
		Random rand = new Random();
		for(int i=0;i<N;i++) {
			int nextEl = rand.nextInt(maxno);
			niz[i]=nextEl;
		}
		return niz;
	}
	
	public static int[] maxmin(int[] b) {
		int N=b.length;
		int[] x=new int[N];
		for(int i=0;i<N;i++) {
			x[i]=b[i];
		}
		int a=0;
		boolean promena=true;
		while(promena==true) {
			promena=false;
			for(int i=1;i<N;i++) {
				if(x[i]>x[i-1]) {
					a=x[i-1];
					x[i-1]=x[i];
					x[i]=a;
					promena=true;
				}
			}
		}
		return x;
	}
	public static int ZbirAttay(int[] niz) {
		int zniz=0;
		int N=niz.length;
		for(int i=0;i<N;i++) {
			zniz=zniz+niz[i];
		}
		return zniz;
	}
	public static int[] ulevo(int[] niz,int k){
		//int[] niz = new int [v.length];
		int[] temp = new int [k];
		int N=niz.length;
		k=k%N;
		int d=0;
		for (int i=0;i<k;i++) {
			temp[i]=niz[i];
		}
		for (int i=k;i<N;i++) {
			int a=i-k;
			niz[a]=niz[i];
		}
		for (int i=N-k;i<N;i++) {
			niz[i]=temp[d];
			d++;
		}
		return niz;
	}
}
