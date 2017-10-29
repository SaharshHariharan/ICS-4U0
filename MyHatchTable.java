public class MyHatchTable{

    private int bn;
    private ArrayList <EmployeeInfo> [] buckets;
       
    public MyHatchTable (int bnn) {
    	bn = bnn
    			
    	buckets = new ArrayList [bnn]
    			
    	for(int i=0; i <= bnn; i++){
            buckets [i] = new ArrayList [] ar; 
       }
    	
    }
    
    public int calcBucket(int keyValue) {
		// Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
		return(keyValue % buckets.length);
	}
        
    public boolean addEmployee(EmployeeInfo theEmployee) {
    	if (theEmployee == null;) {
    		return false
    	} 
    	
    	else {
    		int sn = calcBucket(itemtoadd.getEmpNum());
    		buckets [sn].add(theEmployee);
			return true;
    	}
   }

	
	
	public int searchByEmployeeNumber(int employeeNum) {
		int sn = calcBucket(itemtoadd.getEmpNum());
		int position = -1;
		
		for (i==0, i <= buckets[sn].length, i++) {
			if ( buckets[sn].get(i).getNumber = employeeNum) {
				position = i;
			}
		}
		return position;
		// Determine the position of the employee in the ArrayList for the bucket that employee hashes to.
		// If the employee is not found, return -1.
	}

	
	
	public EmployeeInfo removeEmployee(int employeeNum) {
		int sn = calcBucket(itemtoadd.getEmpNum());
		boolean value = -1;
		
		for (i==0, i <= buckets[sn].length, i++) {
			if ( buckets[sn].get(i).getNumber = employeeNum) {
				buckets[sn].remove(i);
				value = 0;				
			}
		}
		
		if (value == -1) {
			return null;
		} 
		
		else if (value == 0) {
			return true;
		}
		
	}

	
	
	public void displayContents() {
		
		// Print the employee numbers for the employees stored in each bucket's ArrayList,
		// starting with bucket 0, then bucket 1, and so on.
		
		for (int i = 0; i < buckets.length; i++) {

		    // For the current bucket, print out the emp num for each item
                    // in its ArrayList.

                    System.out.println("\nExamining the ArrayList for bucket " + i);
                    int listSize = buckets[i].size();
                    if (listSize == 0) {
		        System.out.println("  Nothing in its ArrayList!");
                    }
                    else {
                        for (int j = 0; j < listSize; j++) {
                           int theEmpNum = buckets[i].get(j).getEmpNum();
                           System.out.println("  Employee " + theEmpNum);
                        }
                    }

                }

	} // end displayContents
    
}
