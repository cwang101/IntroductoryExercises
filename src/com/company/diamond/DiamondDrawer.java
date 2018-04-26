package com.company.diamond;

import com.company.Constant;

public class DiamondDrawer implements Constant {

    public void drawIsoscelesTriangle(int n){
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=2*n-1;i+=2){

            for(int k=n-i/2;k>0;k--){
                sb.append(BLANK);
            }
            for(int j=1;j<=i;j++){
                sb.append(ASTERISK);
            }
            sb.append(NEW_LINE);
        }

        System.out.print(sb.toString());
    }

    public void drawDiamond(int n){
        drawIsoscelesTriangle(n);
        StringBuilder sb=new StringBuilder();
        for (int i=2*n-3;i>0;i-=2){
            for(int k=n-i/2;k>0;k--){
                sb.append(BLANK);
            }
            for(int j=1;j<=i;j++){
                sb.append(ASTERISK);
            }
            sb.append(NEW_LINE);
        }
        System.out.print(sb.toString());
    }

    public void drawDiamondWithName(int n ,String name){
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=2*n-3;i+=2){

            for(int k=n-i/2;k>0;k--){
                sb.append(BLANK);
            }
            for(int j=1;j<=i;j++){
                sb.append(ASTERISK);
            }
            sb.append(NEW_LINE);
        }
        sb.append(name).append(NEW_LINE);

        for (int i=2*n-3;i>0;i-=2){
            for(int k=n-i/2;k>0;k--){
                sb.append(BLANK);
            }
            for(int j=1;j<=i;j++){
                sb.append(ASTERISK);
            }
            sb.append(NEW_LINE);
        }
        System.out.print(sb.toString());

    }
}
