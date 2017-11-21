
package l6q1;

import java.util.Scanner;
/*Write a Java method that implements Euclidean Algorithm to return the greatest
common divisor of two positive integers. Then, write a program to get the GCD for
(24, 8) and (200, 625)*/

public class L6Q4 {
    public static void main(String[] args){  //not yet
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two positive integers to find its (GCD):");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("The GCD for ("+a+","+b+") is");
        gcd(a,b);
    }
    public static int gcd(int a,int b){
        int c = 0,d;
        if(a>b){
            if(a/b==0){
                
            }
           else
                c=a%b;
                d=a-(b*c);
            //return ;
        }    
        return 0;
    }
    }
