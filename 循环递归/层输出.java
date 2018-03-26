package Elementary;

public class fd1xunhuan {
	public static void f(int n)	//递归
	{
		if(n>0) f(n-1);	//层层执行，先输出0，并不是先输出6.每一层执行需要把n压入栈，从最内层开始输出
		System.out.println(n);
	}
	
	public static void main(String[]args) {
		/*for(int i=0;i<10;i++)
			System.out.println(i);*/	//循环
		f(6);
	}
	
	}



