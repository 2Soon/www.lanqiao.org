输入A、B，输出A+B。

package lanqiao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ssc=new Scanner(System.in);
		Integer a=ssc.nextInt();
		Integer b=ssc.nextInt();
		System.out.println(a+b);
	}

}

//	ssc.nextInt()    ssc.nextLine()
next():
1、一定要读取到有效字符后才可以结束输入。
2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
next() 不能得到带有空格的字符串。
nextLine()：
1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
2、可以获得空白。
