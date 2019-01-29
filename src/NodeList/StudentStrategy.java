package NodeList;

public class StudentStrategy implements Strategy {

	@Override
	public boolean equal(Object obj, Object obj2) {
		// TODO Auto-generated method stub
		if(obj instanceof Student && obj2 instanceof Student) {
			Student stu1=(Student)obj;
			Student stu2=(Student)obj;
			if(stu1.getId().equals(stu2.getId()))
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int compare(Object obj, Object obj2) {
		// TODO Auto-generated method stub
		if(obj instanceof Student && obj2 instanceof Student) {
			Student stu1=(Student)obj;
			Student stu2=(Student)obj2;
			return stu1.getName().compareTo(stu2.getName());
		}
		return -1;
	}
	
	
	
}
