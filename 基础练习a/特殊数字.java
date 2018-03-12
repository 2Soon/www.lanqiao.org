/**
问题描述
　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 */
 import java.util.Scanner;
 public class Main{
	 public static void main(String[] args){
		 for(int i=100;i<1000;i++){
				int b=i/100;	//直接除以100获取百位
				int s=i/10%10;	//除以10是15然后取余
				int g=1%10;
				if(i==(b*b*b+s*s*s+g*g*g)){
					System.out.println(i);
				}
		 }
	 }
 }