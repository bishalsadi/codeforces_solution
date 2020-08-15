
package june_2020_codeforces;
import java.util.Scanner;
public class Bear_and_Big_Brother_791A {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(); // Limak 
        int b=sc.nextInt(); //Bob 
        int count=0;
        while(a<=b){   //As long as Limak is less than or equal to Bob 
            a*=3;     
            b*=2;
            count++;
     }
        System.out.println(count);
   }
    }

