问题 1502: [蓝桥杯][算法提高VIP]利息计算
题目描述
编制程序完成下述任务：接受两个数，一个为用  户一年期定期存款金额，一个为按照百分比格式表示的利率；程序计算一年期满后本金与利息总额。说明：（1）存款金额以人民币元为单位，可能精确到分；  （2）输入利率时不需要输入百分号，例如一年期定期存款年利率为2.52%，用户输入2.52即可；（3）按照国家法律，存款利息所得需缴纳20%  的所得税，计算结果时所得税部分应扣除。 
输入
输入一行，包含两个实数，分别表示本金和年利率。 
输出
输出一行，包含一个实数，保留到小数点后两位，表示一年后的本金与利息和。 
样例输入
10000  2.52 
样例输出
10201.60

import java.util.Scanner;
public class main
  {
    public static void(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      double money=sc.nextInt();
      double rate=sc.nextDouble();
     
      money+=money*0.01*rate*0.8;
      
      System.out.println(money);
      System.out.println(rate);
    }
  }
