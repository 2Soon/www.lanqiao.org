public class Main{
	public static void main(String[] args){
		int sum=0;
		for(int i=0;i<100;i++){	//两层循环暴力
			sum=i;
			for(int j=i+1;j<100;j++){
				sum=sum+j;
				if(sum==326){
					System.out.println(i);
				}
			}
		}
	}
}