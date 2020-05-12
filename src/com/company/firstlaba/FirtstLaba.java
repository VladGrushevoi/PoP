package com.company.firstlaba;

public class FirtstLaba {

    public static void main(String[] args) {

            double x=Math.pow(0.5,2)-1, RES=Math.PI - x, x1=x*x, member=x;
            for (int i=1; i<=8; i++) {
                RES+=member;
                member= member * (((2*i+1)*x1*(2*i)*(2*i+1))/((2*i-1)*(2*i+2)*(2*i+3)));

                //RES-=member;
            }
            System.out.println("Result : " + RES);
            System.out.println("Library value : " + Math.acos(x));
    }
}
