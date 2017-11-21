
package l6q1;
/*Write a Java method that accepts an array of 10 integers. The method should reverse
the integer in the array. Example, if the number is 1234, the number will change to
4321*/

import java.util.Scanner;

public class L6Q3 
{
         public static void main(String[] args)//alhamdulillah done!!! want to cry
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
            reverse(num);   
             /*TO DISPLAY INTEGERS
             System.out.print("The numbers are: ");
             for(int i=0;i<=9;i++)
             {
             System.out.print(num[i]+" ");
             }   */    
             
          
         }
         public static void reverse(int[]num){
              int reversedNum;
              for(int i=0;i<=9;i++)
             {
              while(num[i]>0)
              {    
                reversedNum=num[i] % 10;  
                System.out.print(reversedNum);                              
                num[i]=num[i]/10;  
             
              } 
               System.out.println();
             }
          
            
             
         }        
}
