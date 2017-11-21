
package l6q1;

public class L6Q1 {
//returns triangular number
    
    public static void main(String[] args) {//DONE
    
    int a=20;
    triangle(a);  
    System.out.println(); 
    }
    
    public static int triangle(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
            System.out.print(sum+" ");
        }
        return 0;
        
    }
    
}
