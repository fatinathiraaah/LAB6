
package l6q1;

import java.util.Random;
import java.util.Scanner;

/*Write a Java method that accepts three parameters, the method will compare whether
the third parameter value is equal to the multiplication of parameter 1 and parameter
2. Then, write a Java multiplication game for any random number within 0 – 12.*/

public class L6Q5 { //DONE THANKYOU AROFF
        public static void main(String[] args)
        {
            
            Scanner s=new Scanner(System.in);
            Random r=new Random();
            int c=0,score=0;
            
            while(c>=0)
            {
            int a=r.nextInt(13);
            int b=r.nextInt(13);
            System.out.print("Enter negative number to quit:");            
            c=s.nextInt();
            if(c<0)
                break;
            multi(a,b,c); 
            if(c==a*b){
                score++;
            }
            }
            System.out.println("your score is "+score);
                 }
   
        public static void multi(int a, int b, int c) 
        {
            System.out.println(a+" x "+b+" = "+c);           
        }
            
}
 