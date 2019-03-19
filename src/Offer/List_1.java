package Offer;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 */

public class List_1 {
    public static ArrayList<Integer> printListFromTailToHead(List listNode) {
    	int[] array=new int[listNode.size()];
    	int i=listNode.size()-1;
    	for (Object node : listNode) {
			array[i]=(Integer)node;
    		i--;
		}
    	
    	ArrayList<Integer> arrayList=new ArrayList<>();
    	for (int value : array) {
			arrayList.add(value);
		}
    	
    	
    	return arrayList;

    }
	
    public static void main(String[] args) {
		
    	ArrayList<Integer> list=new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	System.out.println(printListFromTailToHead(list));
    	
    	
	}
	
    
}
