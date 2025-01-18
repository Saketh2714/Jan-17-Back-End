package StudentMarksList;
import java.util.ArrayList;
import java.util.List;

public class MarksLstDemo {
	
	
	static int getRandomNumber(int min,int max){
		
		int range = max - min + 1;

          return  (int)(Math.random() * range) + min;
	}

	public static void main(String[] args) {
	
		StudentMarks stuMarks;
		
		int maths;
		int sci;
		int eng;
		int rollNo;
		String name="Stu";
		
		List<StudentMarks> marksList = new ArrayList<StudentMarks>();
		
		for(int i=1;i<=50;i++) {
			
			rollNo = getRandomNumber(1,10);
			name = name + rollNo;
			maths = getRandomNumber(30,95);
			sci = getRandomNumber(20,87);
			eng = getRandomNumber(0,100);
			
			stuMarks = new StudentMarks(rollNo,name,maths,sci,eng);
			
			marksList.add(stuMarks);
			
		}
		
		System.out.println(marksList);
		
	}

}