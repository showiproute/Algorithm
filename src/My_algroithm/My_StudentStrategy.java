package My_algroithm;

import Java_algoirthm.Strategy;
import Part_1.Student;

public class My_StudentStrategy implements My_Strategy{

	@Override
	public boolean equal(Object obj, Object obj2) {
		// TODO Auto-generated method stub
		if(obj instanceof Student && obj2 instanceof Student) {
			Student stu1=(Student)obj;
			Student stu2=(Student)obj2;
			return stu1.getsId().equals(stu2.getsId());
		}
		else
			return false;
	}

	@Override
	public int compare(Object obj, Object obj2) {
		// TODO Auto-generated method stub
		if(obj instanceof Student&& obj2 instanceof Student) {
			Student stu1=(Student)obj;
			Student stu2=(Student)obj2;
			return stu1.getsId().compareTo(stu2.getsId());
		}
		else
			return -1;
	}

}
