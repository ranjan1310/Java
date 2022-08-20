package Recursion.SumofArray;
import java.util.Scanner;
public class sum {
    public static int sume(int input[]) {
		
        int ans=0;
        if(input.length==0){
            return 0;
        }
        int smallInput[] = new int [input.length-1];
        for(int i =1; i<input.length; i++){
            smallInput[i-1]=input[i];
        }
        ans= input[0]+sume(smallInput);
        return ans;
		
	}
   Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sume(input));
        s.close();
	}
}
