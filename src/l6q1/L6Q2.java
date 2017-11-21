
package l6q1;
/*Write a Java method multiPrint(int n, char c) that prints n copies of character c. Then,
write a Java program to use the method to display the triangles and diamonds.
*/

import java.util.Scanner;


public class L6Q2 {
     public static void main(String[] args){//DONE ALHAMDULILLAH
         
         Scanner s=new Scanner(System.in);
         System.out.print("Enter number of rows:");
         int n=s.nextInt();
         System.out.print("Enter a character:");
         char c=s.next().charAt(0);
         System.out.println("Triangle:");
         triangle(n,c);
         System.out.println();
         System.out.println("Diamond:\n");
         diamond(n,c);
         System.out.println();
     }
     public static void triangle(int n, char c)
     {       
         for(int i=1;i<=n;i++)//to print number of rows
         {
            for(int sp=n-i;sp>0;sp--)//to print spaces
            {
             System.out.print(" "); 
            }
                for(int j=1;j<=i;j++)//code up here only to print character right angle triangle
                {                    //hypothenus facing to the right
                    System.out.print(c);
                }
                for(int k=2;k<=i;k++)
                {
                    System.out.print(c); 
                }
             System.out.println();
         }   
     }
     public static void diamond(int n, char c)
     {
         for(int i=1;i<=n;i++)//for number of rows
         {
             for(int sp=n-i;sp>0;sp--)//for print spaces
             {
                 System.out.print(" ");
             }
             for(int j=1;j<=i*2-1;j++)
             {
                 System.out.print(c);
             }
             System.out.println();       
         }
         for(int i=n-1;i>0;i--)//for rows minus one bcs next reverse triangle will hv n-1 rows instead n rows
         {
             for(int sp=1;sp<=n-i;sp++)//for spaces
             {
                 System.out.print(" ");
             }
             for(int j=1;j<=i*2-1;j++)
             {
                 System.out.print(c);
             }
             System.out.println();
         }
     }
     
}  
     /*public static void diamond(int n, char c)
     {
         //for normal triangle
         for(int i=1;i<=n;i++)//to print number of rows
         {
            for(int sp=n-i;sp>0;sp--)//to print decreasing spaces 
            {
             System.out.print(" "); 
            }
                for(int j=1;j<=i;j++)//code up here only to print character right angle triangle
                {                    //hypothenus facing to the right
                    System.out.print(c);
                }
                for(int k=2;k<=i;k++)
                {
                    System.out.print(c); 
                }
             System.out.println();
         }   
         //for reverse triangle
         for(int i=1;i<=n;i++)//to print number of rows
         {
             for(int sp=1;sp<=i;sp++)//to print increasing spaces 
             {
                 System.out.print(" ");
             }
          for(int j=1;j<=n;j++)
          {
              System.out.print(c);
          }
          for(int k=n-i;k>=1;k--)
          {
              System.out.print(c);
          }
          n--;
             System.out.println();
         }
      }*/
     
