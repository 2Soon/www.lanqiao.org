import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,max=0,min=0,sum=0;
        for(int i=1;i<=n;i++)
			{	//必须为大于等于
        	temp=sc.nextInt();
        	sum=sum+temp;
        	if(i==1) {
        		max=min=temp;
        	}
        	if(temp>max) {
        		max=temp;
        	}
        	if(temp<min) {
        		min=temp;
        	}
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}