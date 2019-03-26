package Offer;

/*
 * 求出1~13的整数中1出现的次数,
 * 并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,
 * 并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数
 * （从1 到 n 中1出现的次数）。
 */
public class DigitalComputing_1 {

    public int NumberOf1Between1AndN_Solution(int n) {
    	StringBuilder sb=new StringBuilder();
    	
    	for(int i=1;i<=n;i++) {
    		sb.append(i);
    	}
    	int count=0;
    	String string = sb.toString();
    	for(int i=0;i<string.length();i++) {
    		if(string.charAt(i)=='1')
    			count++;
    	}
    	
    	
    	return count;
    }	
	
    public static void main(String[] args) {
		DigitalComputing_1 obj = new DigitalComputing_1();
    	int res = obj.NumberOf1Between1AndN_Solution(13);
    	System.out.println(res);
    }
    
}
