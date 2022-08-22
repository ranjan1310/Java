package Recursion.PowerofFour;
import java.util.Scanner;
public class Power {
    
        public static boolean isPowerOfFour(int n) {
            if(n==1){
                return true;
            }
            if(n%4!=0||n==0){
                return false;
            }
            return isPowerOfFour(n/4);
            
        }
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            
                int n = s.nextInt();
                System.out.println(isPowerOfFour(n));
            
                s.close();
        }
        
    
    
    
}
