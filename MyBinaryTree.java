public class MyBinaryTree //binary tree class
{

    private int ListPositionNumber; //attributes
    public StudentInfo root;

    public void AddToTree (StudentInfo itemtoadd, StudentInfo current) //method for adding an item to the tree
    { //adds information to tree
	if (ListPositionNumber == 0) //if there is no item in the binary tree
	{
	    root = itemtoadd;  // makes the first item (the root) the item to add
	    ListPositionNumber++; //increases the total number of items by one
	}

	else
	{

	    if (itemtoadd.getNumber () < current.getNumber ()) //if the student number of the current item is smaller than the current item on the list
	    {
		
		if (current.getLeft() == null) //checks to see if the left item is null
		{
			current.setLeft (itemtoadd);//sets left item to the item to add
			ListPositionNumber++; //increases total number of items by one
		}
		
		else
		{
			AddToTree (itemtoadd, current.getLeft()); //if there is an item on left, that item is put back into the method and the recursion happens
		}

	    }

	    else if (itemtoadd.getNumber () > current.getNumber ()) //if the student number of the object is higher than the current item
	    {
		
		if (current.getRight () == null) //checks to see if the right object is null
		{
			current.setRight (itemtoadd); //sets the right object to the item to be added
			ListPositionNumber++; //increases total number in binary tree by 1
		}
		else
		{
			AddToTree (itemtoadd, current.getRight() ); //if the right attribute is not empty, that item is put back into the method and the recursion happens
		}
	    }

	}
    }


    public void InOrder (StudentInfo Node) //InOrder Traversal method
    {
	if (Node != null) //makes sure that the node is not empty
	{
	    InOrder (Node.getLeft ()); //puts the left item back into the in order method
	    System.out.print (Node.getNumber () + ", "); //prints the item when its left is null, indicating it is at the end of the tree
	    InOrder (Node.getRight ()); // goes to the right attribute and puts that into the In Order method
	}
    }


    public void PreOrder (StudentInfo Node) //PreOrder Traversal method
    {
	if (Node != null) //makes sure that the node is not empty
	{
	    System.out.print (Node.getNumber () + ", "); //outputs the current item on the list
	    PreOrder (Node.getLeft ());  //puts the left attribute into the pre order method
	    PreOrder (Node.getRight ()); // puts the right attribute into the pre order method
	}
    }


    public void PostOrder (StudentInfo Node)//PostOrder Traversal method
    {
	if (Node != null) //makes sure that the node is not empty
	{
	    PostOrder (Node.getLeft ());  //puts the left attribute into the post order method
	    PostOrder (Node.getRight ()); //puts the right attribute into the post order method
	    System.out.print (Node.getNumber () + ", ");
	}
    }
    
    public StudentInfo getRoot () //method for getting the root of the binary tree
    {
	return root; 
    }
    
    public void setRoot (StudentInfo r) //method for setting the root of the binary tree
    {
	root = r;
    }
    
    public int getNumberInList () //method for getting the total number of items in the list
    {
	return ListPositionNumber; 
    }
    
    public void setNumberInList (int a) //method for setting the total number of items in the list to a certain number
    {
	ListPositionNumber = a;
    }
}
