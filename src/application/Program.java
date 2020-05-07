package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int vet[][] = new int[M][N];
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				vet[i][j]=sc.nextInt();
				
			}
		}
		System.out.println();
		System.out.print("Digite um numero: ");
		int x = sc.nextInt();
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(vet[i][j]==x) {
					System.out.println("Position: "+i+", "+j);
					if(j>0) {
						System.out.println("left: "+ vet[i][j-1]);
					}
					if(i>0) {
						System.out.println("up: "+ vet[i-1][j]);
					}
					if(i<vet.length-1) {
						System.out.println("down: "+ vet[i+1][j]);
					}
					if(j<vet[i].length-1) {
						System.out.println("right: "+ vet[i][j+1]);
					}
				}
			}
		}
		
		
		sc.close();
	}

}
