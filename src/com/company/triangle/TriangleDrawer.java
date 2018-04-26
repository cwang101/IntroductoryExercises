package com.company.triangle;

import com.company.Constant;


public class TriangleDrawer implements Constant{


    public void drawHorizontalLine(int n){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++){
            sb.append(ASTERISK);
        }
        System.out.println(sb.toString());
    }

    public void drawVerticalLine(int n){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++){
            sb.append(ASTERISK).append(NEW_LINE);
        }
        System.out.println(sb.toString());
    }

    public void drawRightTriangle(int n){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++){
           for(int j=0;j<=i;j++){
               sb.append(ASTERISK);
           }
            sb.append(NEW_LINE);
        }
        System.out.println(sb.toString());
    }

}
