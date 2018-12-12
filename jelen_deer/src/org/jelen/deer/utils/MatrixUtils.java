package org.jelen.deer.utils;

import java.util.Random;
import java.util.Scanner;

public class MatrixUtils {
	public static void printmat(int[][] mat) {
		int N=mat.length;
		int M=mat[0].length;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println(" ");
		}
		System.out.println();
	}
	

	public static int[][] makeRandSquerMatrix(int dim) {
		int[][] mat=new int[dim][dim];
		Random rand = new Random();
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++) {
				int nextEl = rand.nextInt(99);
				mat[i][j]=nextEl;
			}
		}
		return mat;
	}
	public static int[][] makeRandMatrix(int dim,int dim2) {
		int[][] mat=new int[dim][dim2];
		Random rand = new Random();
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim2;j++) {
				int nextEl = rand.nextInt(99);
				mat[i][j]=nextEl;
			}
		}
		return mat;
	}
	public static int[][] makematFromUser() {
	
		Scanner reader = new Scanner(System.in);
		System.out.print("unesi velicinu matrice");
		int N=0;
		N=reader.nextInt();
		int M=0;
		M=reader.nextInt();
		System.out.print("unesi clanoce matrice");
		int[][] mat=new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				mat[i][j]=reader.nextInt();
			}
		}
		reader.close();
		return mat;
	}
	public static int[] DijagonalaMatrix(int[][] mat) {
		int N=mat.length;
		int M=N;
		int[] niz=new int[N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(i==j) {
					niz[i]=mat[i][j];
				}
			}
		}
		return niz;
	}
}
