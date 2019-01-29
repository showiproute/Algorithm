package NodeList;

import java.awt.peer.TrayIconPeer;

import javax.swing.event.ListSelectionEvent;

import Java_algroithm.Strategy;
import Part_1.practice_1_1_13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1=new Student("111","111",111);
		Student stu2=new Student("222","222",222);
		Student stu3=new Student("333", "333", 333);
		Student stu4=new Student("444", "444", 444);
		
//		SLNode sl=new SLNode();
//		SLNode sl2=new SLNode();
//		SLNode sl3=new SLNode();
//		SLNode sl4=new SLNode();
//		
//		sl.setData(stu1);
//		sl.setNext(sl2);
//
//		sl2.setData(stu2);
//		sl2.setNext(sl3);
//		
//		sl3.setData(stu3);
//		sl3.setNext(sl4);
//		
//		sl4.setData(stu4);
//	
//		SLNode head=new SLNode();
//		head=sl;
//		
//		//遍历
//		while(head.hasNext()) {
//			System.out.println(head.getData());
//			head=head.getNext();
//		}
//		System.out.println(head.getData());
		

		StudentStrategy studentStrategy=new StudentStrategy();
		ListSLinked listSLinked=new ListSLinked(studentStrategy);
		try {
			listSLinked.insert(0, stu1);
			listSLinked.insert(1, stu2);
			listSLinked.insertBefore(stu1, stu3);
			listSLinked.insertAfter(stu3, stu4);
		} catch (OutOfBoundayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			listSLinked.PrintLinkedList();
		}
		System.out.println("removing.......................");
		
		try {
			listSLinked.remove(3);
		}catch (OutOfBoundayException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			listSLinked.PrintLinkedList();
		}
		
		
		Object resultnode;
		try {
			resultnode = (Object)listSLinked.get(2);
			System.out.println(resultnode);
		} catch (OutOfBoundayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("end");
		}
		
		try {
			Student stu5=new Student("555","555",555);
			listSLinked.replace(2, stu5);
		}catch (OutOfBoundayException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			listSLinked.PrintLinkedList();
		}
		
	}

}
