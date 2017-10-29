public class EmployeeInfo {

	private int empNum;
    private String firstName;
    private String lastName;
    private int sex; // encode e.g. 0 for M, 1 for F, etc.
    private int workLoc; // encode e.g. 0 for Mississauga, etc.
    private double deductRate; // e.g. 0.21 for 21%
    
    public EmployeeInfo (int n, string fn, string ln, int sx, int wl, double dR) {
    	number = n;
    	firstname = fn;
    	lastname = ln;
    	sex = sx;
    	workLoc = wl;
    	deductRate = dR;
    }
    
    public getNumber {
    	return number;
    }
    
    public void setNumber (int n) {
    	number = n;
    }
}
