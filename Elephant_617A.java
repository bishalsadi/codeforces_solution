
package elephant_617a;

import java.util.Scanner;
public class Elephant_617A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();  //The coordinate of the elephant friend's house
        int count=a/5;
        if(a%5!=0){
            count=count+((a%5)/4);
            if((a%5)%4!=0){
            count=count+(((a%5)%4)/3);
         
            if((((a%5)%4)%3)!=0){
            count=count+((((a%5)%4)%3)/2);
            
            if(((((a%5)%4)%3)%2)!=0){
            count=count+(((((a%5)%4)%3)%2)/1);
            
            }
            }
            }
        }
        System.out.println(count);
    }
}
 