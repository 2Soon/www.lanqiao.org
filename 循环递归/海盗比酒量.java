package 蓝桥;

public class bjl {
	public static void main(String[] args)
	{
		for(int a=20;a>=1;a--)
		{
			for(int b=a-1;b>=1;b--)
			{
				for(int c=b-1;c>=1;c--)
				{
					for(int d=c-1;d>=1;d--)
					{
						//if(1.0/a+1.0/b+1.0/c+1.0/d==1.0)	浮点型换为乘法
						if(b*c*d+a*c*d+a*b*d+a*b*c==a*b*c*d)
							System.out.println(a+" "+b+" "+c+" "+d);
						
					}
				}
			}
		}
	}

}
