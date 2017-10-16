public class MyBinaryTree
{

    private int ListPositionNumber;
    public StudentInfo root;

    public void AddToTree (StudentInfo itemtoadd, StudentInfo current)
    { //adds information to tree
	if (ListPositionNumber == 0)
	{
	    root = itemtoadd;  // makes the first item (the root) the item to add
	    ListPositionNumber++;
	}

	else
	{

	    if (itemtoadd.getNumber () < current.getNumber ())
	    {
		current = current.getLeft ();
		if (current == null)
		{
		    current.setLeft (itemtoadd);
		    ListPositionNumber++;
		}
		else
		{
		    AddToTree (itemtoadd, current);
		}

	    }

	    else if (itemtoadd.getNumber () > current.getNumber ())
	    {
		current = current.getRight ();
		if (current == null)
		{
		    current.setRight (itemtoadd);
		    ListPositionNumber++;
		}
		else
		{
		    AddToTree (itemtoadd, current);
		}
	    }

	}
    }


    public void InOrder (StudentInfo Node)
    {
	if (Node != null)
	{
	    InOrder (Node.getLeft ());
	    System.out.print (Node.getNumber () + ", ");
	    InOrder (Node.getRight ());
	}
    }


    public void PreOrder (StudentInfo Node)
    {
	if (Node != null)
	{
	    System.out.print (Node.getNumber () + ", ");
	    PreOrder (Node.getLeft ());
	    PreOrder (Node.getRight ());
	}
    }


    public void PostOrder (StudentInfo Node)
    {
	if (Node != null)
	{
	    PostOrder (Node.getLeft ());
	    PostOrder (Node.getRight ());
	    System.out.print (Node.getNumber () + ", ");
	}
    }
    
    public StudentInfo getRoot ()
    {
	return root; 
    }
    
    public void setRoot (StudentInfo r) 
    {
	root = r;
    }
    
    public int getNumberInList ()
    {
	return ListPositionNumber; 
    }
    
    public void setNumberInList (int a)
    {
	ListPositionNumber = a;
    }
}
