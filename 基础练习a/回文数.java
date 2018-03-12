public class huiwen {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {		//第一个循环控制千位
			for(int j=0;j<=9;j++) {		//第二个控制百位
				System.out.println(i*1000+j*100+j*10+i);
			}
		}
	}