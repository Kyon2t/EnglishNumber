package en;
import java.util.Scanner;

public class IntToEng {
	//メインメソッド
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        System.out.println(translateEng(input));
	    }
	    // 数値を英訳する変換するメソッド
	    public static String translateEng(int n) {
	    	String[] number;	    	
	    	number = new String[]{
	    		"zero",
	    		"one",
	    		"two",
	    		"three",
	    		"four",
	    		"five",
	    		"six",
	    		"seven",
	    		"eight",
	    		"nine",
	    		"ten",
	    		"eleven",
	    		"twelve",
	    		"thirteen",
	    		"fourteen",
	    		"fifteen",
	    		"sixteen",
	    		"seventeen",
	    		"eighteen",
	    		"nineteen",
	    		"twenty",
	    		"twenty one",
	    		"twenty two",
	    		"twenty three",
	    		"twenty four",
	    		"twenty five",
	    		"twenty six",
	    		"twenty seven",
	    		"twenty eight",
	    		"twenty nine",
	    		"thirty",
	    		"thirty one",
	    		"thirty two",
	    		"thirty three",
	    		"thirty four",
	    		"thirty five",
	    		"thirty six",
	    		"thirty seven",
	    		"thirty eight",
	    		"thirty nine",
	    		"forty"
	    	};
	    	String ten [] = {"zero","one","two","three","four","five","six","seven","eight","nine",};
	    	String tenTimes [] = {"ten","twenty",};
	        return number[n];	        
	    }    
}
