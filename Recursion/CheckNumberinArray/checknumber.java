package Recursion.CheckNumberinArray;
import java.util.Scanner;
public class checknumber {
    public static boolean checkNumbert(int input[], int x) {
		
        if(input.length<1){
            return false;
        }
        if(input[0]==x){
            return true;
        }
        int smallInput[] = new int [input.length-1];
        for(int i=1;i<input.length;i++){
            smallInput[i-1]=input[i];
        }
        boolean checkans=checkNumbert(smallInput,x);
        if(!checkans){
            return false;
        }else{
            return true;
        }
		
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(checkNumbert(input,x));
        s.close();
        
	}
}
