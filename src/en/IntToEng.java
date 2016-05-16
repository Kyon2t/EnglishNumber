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
	    	String engName;
	    	String ten [] = {"one","two","three","four","five","six","seven","eight","nine"};
	    	String teen[] = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	    	String tenTimes [] = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	    	if(n==0) return"zero";
	    	if(n%10==0) {
	    		int m = n/10;
	    		return tenTimes[m-1];
	    	}else{
	    		if(n<10){
	    			return ten[n-1];
	    		}else if(n<20){
	    			return teen[n-11];
	    		}else{
	    			int huta = n/10;
	    			int hito = n%10;
	    			engName = tenTimes[huta-1]+ten[hito-1];
	    			return engName;
	    		}
	    	}
	    }    
}
