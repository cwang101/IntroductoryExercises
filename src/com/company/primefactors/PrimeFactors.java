package com.company.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public String  generateFactors(int n){
        List<String> list=new ArrayList<>();
        boolean flag=true;
        while(flag) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    list.add(String.valueOf(i));
                    n = n / i;
                    break;
                }
                if(i==n-1){
                    flag=false;
                }
            }


        }
        list.add(String.valueOf(n));
        return  String.join(",",list);
    }

    public static void main(String[] args) {
        System.out.println(new PrimeFactors().generateFactors(100));
    }
}
