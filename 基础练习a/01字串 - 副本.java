import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		for(int i=0;i<32;i++){
			String s="00000"+Integer.toBinaryString(i);
			System.out.println(s.substring(s.length()-5));
		}
	}
}