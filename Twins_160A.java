
package june_2020_codeforces;

import java.util.Scanner;

public class Twins_160A {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    int a=sc.nextInt(); // total no of coins
    int sum=0;
  int b[]=new int[a];
       for (int i = 0; i < b.length; i++) {
           b[i]=sc.nextInt();    // values of each coins
         sum+=b[i];
       }
       if(sum%2==0){       //finding out amount I want if coins sum is even 
      sum=(sum/2)+1;
   
   }
       else{
           sum=(sum+1)/2;  //finding out amount I want if coins sum is odd
       }

       for (int i = 0; i <b.length; i++) { //sorting coins in descending order
           
           for (int j = i+1; j <b.length; j++) {
               if(b[j]>b[i]){
                   int temp=b[j];
                   b[j]=b[i];
                   b[i]=temp;
               }
           }
       }
   }
}
