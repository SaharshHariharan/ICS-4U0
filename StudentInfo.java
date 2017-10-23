public class StudentInfo { //Creates the class StudentInfo
	
	private StudentInfo left;  //All the attributes
	private StudentInfo right;
	private int number ;  
	private String firstname;
	private String lastname;
	
	public StudentInfo (int number, String FN, String LN){ //Method to add information into an object of this class
		
		firstname = FN;
		lastname = LN;
		left = null;
		right = null;
		
		this.number = number;
	}
	
	public StudentInfo getLeft () { //Method to get the Left attribute
		return left;
	}
	
	public void setLeft (StudentInfo fd) { //Method to set the Left attribute
		left = fd;
	}
	
	public StudentInfo getRight () { //Method to get the Right attribute
		return right;
	}
	
	public void setRight (StudentInfo fd) { //Method to set the Left attribute
		right = fd;
	}
	
	public int getNumber () { //Method to get the student number
		return number;
	}
	
	public void setNumber (int numb) { //Method to get set the student number
		number = numb;
	}
	

}
