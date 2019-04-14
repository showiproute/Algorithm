package Offer;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JD_mianshi_1 {

	public static String solution(int n,double V,double[] a,double[] b) {
		double[] rate=new double[n];
		double sum=0;
		
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		
		for(int i=0;i<n;i++) {
			rate[i]=a[i]/sum;
		}
		
		double result=0.0;
		double store_v=V;
	
		while(V>0) {
			ArrayList<Double> tmp=new ArrayList<>();
			for(int i=0;i<n;i++) {
				tmp.add(b[i]*rate[i]);				
			}
			
			Collections.sort(tmp);
			
			double value=tmp.get(0);
			
			if(value<=0.0)
				break;
			
			for(int i=0;i<n;i++) {

				b[i]-=value;
				if(b[i]<0) break;
			}			
			
			double counts=0.0;
			for (Double item : tmp) {
				counts+=item;
			}
			
			
			if(counts+result<=store_v) {
				result+=counts;
				V-=counts;
			}
		}
		DecimalFormat format=new DecimalFormat("0.0000");
		return format.format(result);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n  = sc.nextInt();
		double V = sc.nextDouble();
		double[] a=new double[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();
		}
		double[] b=new double[n];
		for(int i=0;i<n;i++) {
			b[i]=sc.nextDouble();
		}
		
		System.out.println(solution(n, V, a, b));
	}
	
}
