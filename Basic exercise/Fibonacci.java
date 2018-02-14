/**

Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
**/


import java.util.Scanner;
public class Main{
  pbblic static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n,i++;)
        {c=a+b;
         a=b;
         if(c<10007){
         b=c;
         }else{
         b=c%10007;
         }
        }
  System.out.println(a);
  }

}
