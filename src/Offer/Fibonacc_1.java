package Offer;

public class Fibonacc_1 {

	/*
	 * 大家都知道斐波那契数列，现在要求输入一个整数n，
	 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
		n<=39
		1 1 2 3 5 8 13 ....
	 */
    public int Fibonacci(int n) {
    	int fn1=1;
    	int fn2=1;
    	
    	if(n<=0) 
    		return 0;
    	
    	if(n==1||n==2) 
    		return 1;
    	
    	while(n-->2) {
    		fn2=fn1+fn2;
    		fn1=fn2-fn1;
    	}
    	
    	return fn2;
    }
	
	
    public static void main(String[] args) {
    	Fibonacc_1 fibonacc_1 = new Fibonacc_1();
    	System.out.println(fibonacc_1.Fibonacci(10));
	}
}
