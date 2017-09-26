
public class MyLL {


    // ATTRIBUTES
    
    private StudentInfo frontOfList;
    private int numInList;
    
    
    // CONSTRUCTORS
    
    public MyLL() {
	// Make the list initially empty.
	frontOfList = null;
	numInList = 0;
    }
    
    
    // METHODS
    
    public boolean addToRear (StudentInfo itemToAdd) {
	// Adds itemToAdd to the rear of the linked list.
    
	if (numInList == 0) {
	    // Let's add the item to the empty list.
	    frontOfList = itemToAdd;
	}
	else {
	    // There is at least one item already in the list.
	    StudentInfo currentItem = frontOfList;
	    // Head down to the current rear of the list.
	    for (int i = 1; i < numInList; i++) {
		currentItem = currentItem.getNext();
	    }
	    // currentItem should be pointing at the current rear of the list.
	    // Make itemToAdd the new rear item, the old rear item becomes the
	    // second last item.
	    currentItem.setNext(itemToAdd);
	}
	numInList++;
	return(true);
    }
    
    public boolean addToFront(StudentInfo itemToAdd) {
	if (numInList > 0) {
	    itemToAdd.setNext (frontOfList)
	}
	frontOfList = itemToAdd;
	numInList++
	return(true);
    }
    
   
    public StudentInfo removeFromRear() {
       if (numInList == 0) {
	    return (null);
	}
	else {
	    StudentInfo currentItem = frontOfList;
	    for (int i = 1; i < numInList; i++) {
		currentItem = currentItem.getNext();
		if (i = numInList - 1) {
		    currentItem = null;
		}
	    }
	}
	numInList = numInList - 1
	return(null);
    }
	
    public StudentInfo removeFromFront() {
	if (numInList == 0) {
	    return (null);
	}
	if (numInList > 0 ) {
	    StudentInfo ItemRemoved = frontOfList;
	    frontOfList = frontOfList.getNext();
	    ItemRemoved .setNext(null);
	    numInList--;
	    return (ItemRemoved);
	}
    }
    
    public void displayLL() {
	// Display the contents of the linked list from front to rear.
	System.out.println("\nfrontOfList has value " + frontOfList);
	if (numInList == 0) {
	    System.out.println("The list is empty!!!");
	}
	else {
	    StudentInfo currentItem = frontOfList;
	    System.out.println("There are " + numInList + " students in the list!  From front to rear they are:");
	    for (int i = 0; i < numInList; i++) {
		System.out.println("    " + currentItem + "  " + currentItem.getFirstName());
		currentItem = currentItem.getNext();
	    }   
	}
    }
    
}
    
