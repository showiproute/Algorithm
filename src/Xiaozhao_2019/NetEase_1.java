package Xiaozhao_2019;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class NetEase_1 {
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][2];
        TreeMap map = new TreeMap();
        for(int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (e1, e2) -> (int)(e1[0] - e2[0]));
        for(int i = 1; i < arr.length; i++) {
            arr[i][1] = Math.max(arr[i-1][1], arr[i][1]);
        }
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i][0], arr[i][1]);
        }
        for(int i = 0; i < M; i++) {
            int ability = sc.nextInt();
            Integer index = (Integer) map.floorKey(ability);
            if(index != null) {
                System.out.println(map.get(index));
            } else {
                System.out.println(0);
            }
        }
    }
	
	
}
