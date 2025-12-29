package dynamicprogramming;

import java.util.Arrays;

public class Knapsack {
    static int a = -1;

   static int[][] tp = new int[100][100];
    public static void main(String[] args) {
        int[] w = {1,3,4,5,6};
        int[] p = {5,7,8,9,2};
        int cap = 11;
        for(int[] row: tp){
            Arrays.fill(row, -1);
        }
        System.out.println(knapsack(w, p, cap, w.length));
    }

    private static int knapsack(int[] w, int[] p, int cap, int n) {
        if(n==0 || cap==0){
            return 0;
        }

        if(tp[n][cap] != -1){
            return tp[n][cap];
        }

        if(w[n-1]<=cap){
            return tp[n][cap] = Math.max(p[n-1] + (knapsack(w, p,cap - w[n-1], n-1)),knapsack(w,p,cap,n-1));
        }
        else {
           return tp[n][cap] = knapsack(w,p,cap,n-1);
        }
    }


}

