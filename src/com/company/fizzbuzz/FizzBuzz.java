package com.company.fizzbuzz;

import com.company.Constant;
import com.sun.xml.internal.ws.util.StringUtils;


public class FizzBuzz implements Constant{
    static final String FIZZ ="Fizz";
    static final String BUZZ ="Buzz";
    private String generate(int n){
        StringBuilder sb=new StringBuilder();
        if(n%3==0){
            sb.append(FIZZ);
        }
        if(n%5==0){
            sb.append(BUZZ);
        }

        if(sb.toString().length()<=0){
            return sb.append(n).append(NEW_LINE).toString();
        }
        return sb.append(NEW_LINE).toString();
    }

    public void game(int n){
        for(int i=0;i<=n;i++){
            System.out.print(generate(i));
        }
    }
}
