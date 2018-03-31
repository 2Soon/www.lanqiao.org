package lq327;
import java.util.Scanner;
public class gbs{  
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();    
        int b = sc.nextInt();    
        sc.close();    
        System.out.println(lcm(a, b));    
    }    
        
    private static int lcm(int a, int b) {    
        int g = gcd(a, b);    
        return a * b / g;    
    }    
        
    private static int gcd(int a, int b) {    
        if (b == 0) {    
            return a;    
        } else {    
            return gcd(b, a % b);  //辗转相除法  
        }    
    }    
}