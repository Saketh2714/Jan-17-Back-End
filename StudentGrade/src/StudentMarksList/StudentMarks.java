package StudentMarksList;

public class StudentMarks {
	
	int rollNo;
	String name;
	int maths;
	int sci;
	int eng;
	public StudentMarks() {
		super();

	}
	public StudentMarks(int rollNo, String name, int maths, int sci, int eng) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "\n { \n \"rollNo\":"+ rollNo + " ,\n \"name\": \"" + name + "\",\n  \"maths\":" + maths 
				+ ", \n \"sci\":" +
	sci + ", \n \"eng\":"
				+ eng + "}\n";
	}
	
	

}