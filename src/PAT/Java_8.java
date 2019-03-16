package PAT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java_8 {

	public static int jiaWin=0;
	public static int jiaPing=0;
	public static int jialose=0;
	
	public static int CjiaWin=0;
	public static int JjiaWin=0;
	public static int BjiaWin=0;
	
	public static int CyiWin=0;
	public static int JyiWin=0;
	public static int ByiWin=0;
	
	public static int YiWin=0;
	public static int YiPing=0;
	public static int Yilose=0;
	
	public static HashMap<String, Integer> mapjia=new HashMap<>();
	public static HashMap<String, Integer> mapYi=new HashMap<>();
	
	public static void caiquan(String jia,String yi) {
		if(jia.equals("C")) {
			if(yi.equals("C")) {
				jiaPing++;
				YiPing++;
			}
			if(yi.equals("J")) {
				jiaWin++;
				Yilose++;
				
				CjiaWin++;
			}
			if(yi.equals("B")) {
				jialose++;
				YiWin++;
				
				ByiWin++;
			}
		}
		if(jia.equals("J")) {
			if(yi.equals("C")) {
				jialose++;
				YiWin++;
				
				CyiWin++;
			}
			if(yi.equals("J")) {
				jiaPing++;
				YiPing++;
			}
			if(yi.equals("B")) {
				jiaWin++;
				Yilose++;
				
				JjiaWin++;
				
			}
		}
		if(jia.equals("B")) {
			if(yi.equals("C")) {
				jiaWin++;
				Yilose++;
				
				BjiaWin++;
			}
			if(yi.equals("J")) {
				jialose++;
				YiWin++;
				
				JyiWin++;
			}
			if(yi.equals("B")) {
				jiaPing++;
				YiPing++;
			}
		}
	}
	
	public static void getMost() {
		mapjia.put("C", CjiaWin);
		mapjia.put("J", JjiaWin);
		mapjia.put("B", BjiaWin);

		mapYi.put("C", CyiWin);
		mapYi.put("J",JyiWin);
		mapYi.put("B",ByiWin);
		
		if(mapjia.get("B")>=mapjia.get("C")) {
			if(mapjia.get("B")>=mapjia.get("J")) {
				System.out.print("B"+" ");
			}else {
				System.out.print("J"+" ");
			}
		}else {
			if(mapjia.get("C")>=mapjia.get("J")) {
				System.out.print("C"+" ");
			}else {
				System.out.print("J"+" ");
			}
		}
		
		if(mapYi.get("B")>=mapYi.get("C")) {
			if(mapYi.get("B")>=mapYi.get("J")) {
				System.out.print("B"+" ");
			}else {
				System.out.print("J"+" ");
			}
		}else {
			if(mapYi.get("C")>=mapYi.get("J")) {
				System.out.print("C"+" ");
			}else {
				System.out.print("J"+" ");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		ArrayList<String> arrayjia=new ArrayList<>();
		ArrayList<String> arrayyi=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			String[] fields = scanner.nextLine().split(" ");
			arrayjia.add(fields[0]);
			arrayyi.add(fields[1]);		
		}
		scanner.close();
		
		for(int i=0;i<N;i++) {
			String jia = arrayjia.get(i);
			String yi = arrayyi.get(i);
			caiquan(jia, yi);
		}
		
		
		System.out.print(jiaWin+" "+jiaPing+" "+jialose+"\n");
		System.out.print(YiWin+" "+YiPing+" "+Yilose+"\n");
		getMost();
		
	}
	
}
