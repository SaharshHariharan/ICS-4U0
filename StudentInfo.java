public class StudentInfo {
	
	private StudentInfo left;
	private StudentInfo right;
	private int number ;  
	private String firstname;
	private String lastname;
	
	public StudentInfo (int N, String FN, String LN){
		number = N;
		firstname = FN;
		lastname = LN;
		left = null;
		right = null;
	}
	
	public StudentInfo getLeft () {
		return left;
	}
	
	public void setLeft (StudentInfo fd) {
		left = fd;
	}
	
	public StudentInfo getRight () {
		return right;
	}
	
	public void setRight (StudentInfo fd) {
		right = fd;
	}
	
	public int getNumber () {
		return number;
	}
	
	public void setNumber (int numb) {
		number = numb;
	}
	

}
