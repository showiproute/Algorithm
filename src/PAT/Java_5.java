package PAT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Java_5 {
	
	public static class Student{
		/**
		 * @return the sUid
		 */
		public int getsUid() {
			return sUid;
		}
		/**
		 * @param sUid the sUid to set
		 */
		public void setsUid(int sUid) {
			this.sUid = sUid;
		}
		/**
		 * @return the dScore
		 */
		public int getdScore() {
			return dScore;
		}
		/**
		 * @param dScore the dScore to set
		 */
		public void setdScore(int dScore) {
			this.dScore = dScore;
		}
		/**
		 * @return the cScore
		 */
		public int getcScore() {
			return cScore;
		}
		/**
		 * @param cScore the cScore to set
		 */
		public void setcScore(int cScore) {
			this.cScore = cScore;
		}
		/**
		 * @return the sum
		 */
		public int getSum() {
			return sum;
		}
		/**
		 * @param sum the sum to set
		 */
		public void setSum(int sum) {
			this.sum = sum;
		}

		private int sUid;
		private int dScore;
		private int cScore;
		private int sum;
		public Student(int sUid,int dScore,int cScore) {
			this.sUid=sUid;
			this.dScore=dScore;
			this.cScore=cScore;
			this.sum=dScore+cScore;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return sUid+" "+dScore+" "+cScore;
		}
		
	}
	
	
	public static Comparator<Student> comparator=new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			if(o1.getSum()<o2.getSum()) {
				return -1;
			}
			if(o1.getSum()==o2.getSum()) {
				if(o1.getdScore()!=o2.getdScore()) {
					return Integer.compare(o2.getdScore(), o1.getdScore());
				}else if(o1.getdScore()==o2.getdScore()) {
					return Integer.compare(o1.getsUid(), o2.getsUid());
				}
			}
			
			return -1;
		}
	};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int L = scanner.nextInt();
		int H = scanner.nextInt();
		
		int sUid;
		int dScore;
		int cScore;
		int total=0;
		
		List<Student> arrayList = new ArrayList<>();
		List<Student> first = new ArrayList<>();
		List<Student> second = new ArrayList<>();
		List<Student> third = new ArrayList<>();
		List<Student> fourth = new ArrayList<>();
		
		
		for(int i=0;i<N;i++) {
			sUid = scanner.nextInt();
			dScore=scanner.nextInt();
			cScore=scanner.nextInt();
			Student student = new Student(sUid, dScore, cScore);
			arrayList.add(student);
		}
		
		for (Student student : arrayList) {
			if(student.getdScore()>=L && student.getcScore()>=L) {
				if(student.getdScore()>=H && student.getcScore()>=H) {
					first.add(student);
				}
				else if(student.getcScore()<=H&&student.getdScore()>=H) {
					second.add(student);
				}else if(student.getdScore()<=H && student.getcScore()<=H &&
						student.getdScore()>=student.cScore) {
					third.add(student);
				}else {
					fourth.add(student);
				}
			}
		}
		
		Collections.sort(first,comparator);
		Collections.sort(second,comparator);
		Collections.sort(third,comparator);
		Collections.sort(fourth,comparator);
		total+=first.size();
		total+=second.size();
		total+=third.size();
		total+=fourth.size();
		
		System.out.println(total);
		for (Student student : first) {
			System.out.println(student);
		}
		for (Student student : second) {
			System.out.println(student);
		}
		for (Student student : third) {
			System.out.println(student);
		}
		for (Student student : fourth) {
			System.out.println(student);
		}
	
	}
	
	
}
