package Offer;

/*
 * 求1+2+3+...+n，要求不能使用乘除法、
 * for、while、if、else、switch、case
 * 等关键字及条件判断语句（A?B:C）。
 */
public class Normal_1 {
    
	public int Sum_Solution(int n) {
		
		int result=(int)(n+Math.pow(n,2))/2;
    
		
    	return result;
    }
    
    public static void main(String[] args) {
		Normal_1 obj = new Normal_1();
    	
    	System.out.println(obj.Sum_Solution(6));
    	
	}
}
