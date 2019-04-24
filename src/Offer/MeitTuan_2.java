package Offer;

/*
 * 美团面试
 */
import java.util.Scanner;

public class MeitTuan_2 {

	public static void trackCal(int n) {
		int[] location=new int[n*4];
		//initialize
		for(int i=0;i<n*4;i++) {
			location[i]=0;
		}
	
		int length=n*4;
		int step=n;
		int counts=0;
		int value=n+1;
		
		location[step]=1;
		counts++;
		
		while(true) {
			step=(step+value)%length;
			if(location[step]==1) {
				counts++;
				break;
			}else {
				location[step]=1;
				counts++;
			}
		}
		System.out.println(counts);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String t = sc.nextLine();
			int num = Integer.parseInt(t);
			int[] arrayN=new int[num];
			
			String[] fields = sc.nextLine().split(" ");
			for(int i=0;i<num;i++) {
				arrayN[i]=Integer.parseInt(fields[i]);
			}
			
			for(int i=0;i<num;i++) {
				trackCal(arrayN[i]);
			}
		}
	}
	
}
