package com.gla.arrays;
import java.util.*;
public class TransposeOfMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] art =new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
               art[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(art[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(art[j][i]+" ");
            }
            System.out.println();
        }
    }
}
