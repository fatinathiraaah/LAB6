
package l6q1;
/*Write a Java method that accepts an array of 10 integers. The method should reverse
the integer in the array. Example, if the number is 1234, the number will change to
4321*/

import java.util.Scanner;

public class L6Q3 
{
         public static void main(String[] args)//not yet
         {
             
             Scanner s=new Scanner(System.in);
             int[]num=new int [10];
           
             System.out.println("Enter 10 integers:");
             //TO CAPTURE INTEGERS
             for(int i=0;i<=9;i++)
             {
                   num[i]=s.nextInt();                    
             }
            System.out.println();     
             /*TO DISPLAY INTEGERS
             System.out.print("The numbers are: ");
             for(int i=0;i<=9;i++)
             {
             System.out.print(num[i]+" ");
             }   */             
        
            reverse(num);    
         }
         public static void reverse(int []num)
         {   
             int reversedNum=0;
             for(int i=0;i<=9;i++)
             {
              while(num[i]>0)
              {    
                reversedNum = reversedNum * 10 + num[i] % 10;                               
                num[i]=num[i]/10;              
              } 
              
             }
             System.out.println(reversedNum);
             System.out.println();

         }
}
