package ListExample;
 
 import java.util.ArrayList;
 import java.util.List;

 public class StudentList {
	 
	 public static void main(String[] args) {
	 
	List<String> StudentList = new ArrayList<>();
	
	
	   StudentList.add("Zeleke");
		StudentList.add("Bini");
		StudentList.add("John");
				
		System.out.println(StudentList.get(2));
		StudentList.remove(0);
		System.out.println("StudentList: "  + StudentList);
		
		System.out.println("Total size: "  + StudentList.size());
		}

}
