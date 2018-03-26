package 蓝桥;

public class gys {
	public static void main(String[] args)
	{
		int a=15;
		int b=40;
		
		for(int i=a;i>=1;i--) {
			if(a%i==0&&b%i==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
