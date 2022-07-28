package com.ioliveira.hackerrank;

public class Test {
    public static void main(String[] args) {

        int energy = 100;
        int k = 3;
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};

        /*for (int i = 0; i <= c.length - k; i = i + k) {
            if (c[i] == 0) {
                energy = energy - 1;
            } else {
                energy = energy - 1 - 2;
            }
        }

        System.out.println(energy);*/







        int n = c.length;
        int ind = k%n;
        int r = 100;

        if(c[ind]==1){
            r-=3;
        }else if(c[ind]==0){
            r-=1;
        }

        while(ind!=0){
            ind = (ind+k)%n;

            r-=c[ind]*2+1;

            System.out.println(ind);

        };

        //System.out.println(r);


    }
}
