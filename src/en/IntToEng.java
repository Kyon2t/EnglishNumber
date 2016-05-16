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
	    	String tenTimes [] = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	    	if(n==0) return"zero";
	    	if(n%10==0 && n<100) {
	    		int m = n/10;
	    		return tenTimes[m-1];//10, 20, 30...
	    	}else if (n%10!=0 && n<100){
	    		if(n<10){
	    			return ten[n-1];//1~9
	    		}else if(n<20){
	    			return teen[n-11];//11~19
	    		}else{
	    	    	int hito = n%10;
	    			int huta = n/10;
	    			engName = tenTimes[huta-1]+" "+ten[hito-1];
	    			return engName;//21~99
	    		}
	    	}else if(n%100==0 && n<1000){return ten[n/100-1]+" hundred";
	    	}else if(n%100!=0 && n<1000){
	    		int san = n/100;
	    		int shimohutaketa = n-san*100;
	    		int hito = shimohutaketa%10;
    			int huta = shimohutaketa/10;
    			if(hito==0){return ten[san-1]+" hundred "+tenTimes[huta-1];}
    			engName = ten[san-1]+" hundred "+tenTimes[huta-1]+" "+ten[hito-1];
    			return engName;
	    	}else if(n%1000==0 && n<10000){
	    		return ten[n/1000-1]+" thousand";
	    	}else if(n%1000!=0 && n<10000){
	    		int yon = n/1000;
	    		int shimosanketa = n-yon*1000;
	    		int san = shimosanketa/100;
	    		int shimohutaketa = shimosanketa-san*100;
	    		int hito = shimohutaketa%10;
    			int huta = shimohutaketa/10;
    			if(huta==0){return ten[yon-1]+" thousand "+ten[san-1]+" hundred";}
    			if(hito==0){return ten[yon-1]+" thousand "+ten[san-1]+" hundred "+tenTimes[huta-1];}
    			engName = ten[yon-1]+" thousand "+ten[san-1]+" hundred "+tenTimes[huta-1]+" "+ten[hito-1];
    			return engName;
	    	}else if(n%1000==0 && n<100000){
	    		if(n%10000==0) return tenTimes[n%10000-1]+" thousand";
	    		else {
	    			int kamihutaketa = n/1000;
	    			int yon = (n-(n/10000)*10000)/1000;
	    			int go = n/10000;
	    			if(kamihutaketa<20)return teen[kamihutaketa-11]+ " thousand";
	    			else return tenTimes[go-1]+" "+ten[yon-1]+" thousand";
	    		}
	    	}else if(n%1000!=0 && n<100000){
	    		int kamihutaketa = n/1000;
	    		int yon = (n-(n/10000)*10000)/1000;
    			int go = n/10000;
    			if(yon==0) engName = tenTimes[go-1]+" thousand ";
    			else if(go==1) engName = teen[yon-1]+" thousand ";
    			else engName = tenTimes[go-1]+ten[yon-1]+" thousand ";
    			int shimosanketa = n-(n/1000)*1000;
    			int san = shimosanketa/100;
	    		int shimohutaketa = shimosanketa-san*100;
	    		int hito = shimohutaketa%10;
    			int huta = shimohutaketa/10;
    			if(hito==0) engName += ten[san-1]+" hundred "+tenTimes[huta-1];
    			else engName += ten[san-1]+" hundred "+tenTimes[huta-1]+" "+ten[hito-1];
    			return engName;
	    	}else if(n==100000) {return "one hundred thousand";
	    	}else{
		    	return "fail to translate";
	    	}
	    }    
}
