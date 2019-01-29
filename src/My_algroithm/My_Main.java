package My_algroithm;

import Part_1.Student;

public class My_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_StudentStrategy my_StudentStrategy=new My_StudentStrategy();
		My_ListArray my_ListArray=new My_ListArray(10, my_StudentStrategy, 0);
		Student stu1=new Student("1","1","1");
		Student stu2=new Student("2","2","2");
		Student stu3=new Student("3","3","3");
		Student stu4=new Student("4","4","4");
		try {
			my_ListArray.insert(0, stu1);
			my_ListArray.insert(1, stu2);
			my_ListArray.insertBefore(stu2,stu3);
			my_ListArray.insertAfter(stu3, stu4);
		} catch (My_OutOfBoundaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		my_ListArray.PrintList();
		
		int indexofstu1=my_ListArray.indexOf(stu1);
		int indexofstu2=my_ListArray.indexOf(stu2);
		System.out.println(indexofstu1);
		System.out.println(indexofstu2);
		int indexofstu3=my_ListArray.indexOf(stu3);
		System.out.println(indexofstu3);
		
		Student teststu=new Student("test","test","test");
		try {
			my_ListArray.remove(1);
		} catch (My_OutOfBoundaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("remove after");
		my_ListArray.PrintList();
		
		
		try {
			my_ListArray.replace(1, teststu);
		} catch (My_OutOfBoundaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("replace after");
		my_ListArray.PrintList();
		
	}

}
