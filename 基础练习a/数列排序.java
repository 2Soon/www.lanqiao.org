import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] array=new int[n];
		for(int i=0;i<array.length;i++){	//遍历输入
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);		//数组排序
		for(int i:array){
			System.out.print(i+" ");
		}
		// for(int i=0；i<array.length;i++){
			// System.out.print(array[i]+" ");
		// }
	}
	
}