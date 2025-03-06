package List;
import java.util.ArrayList;
import java.util.List;
public class ListExample {

	public static void main(String[] args) {
		
		List<String> StudentList = new ArrayList<>();
		
		
	StudentList .add( "hilina");
	StudentList .add( "zeleke");
	StudentList .add( "Binyam");
	StudentList .add( "Mati");
	StudentList .add( "Selam");
	
	
	System.out.println("second element:" + StudentList.get(1));
	
	StudentList.remove(0);
	System.out.println("studentlist:" + StudentList);
	System.out.println("Total size:" +StudentList );
	
	}

}
