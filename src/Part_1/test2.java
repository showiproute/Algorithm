package Part_1;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class test2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			double x=7.8;
			int n=(int)x;
			System.out.println(n);
			
			System.out.println(n+"hello");
		
			String str1="hello";
			String str2="hhh";
			
			System.out.println(str1.compareTo(str2));
			
			int[] a= {1,2,3};
			int[] b=a;
			for(int i=0;i<b.length;i++)
				b[i]++;
			
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);

			int[] c=new int[3];
			System.arraycopy(a, 0, c,0, 3);
			
			for(int i=0;i<c.length;i++)
				System.out.print(c[i]);
			
			
			People people=new People("richard","321");
			System.out.println(people);
			people.setId("111");
			System.out.println(people);
			
			
			Student stu=new Student("aa","132321","2123");
			System.out.println(stu);
			
			People p=new Student("richard","222","333");
			System.out.println(p);
			
			if(p instanceof Student) {
				Student s=(Student)p;
				System.out.println(s);
			}
			
			Object obj=new People("Jack","00001");
			System.out.println(obj);
			
			Compare com=new Student("Cary","0003","2222");
			System.out.println(com);
			
			if(com instanceof Student) {
				Student newcom=(Student)com;
				System.out.println(newcom);
			}

	}

}
