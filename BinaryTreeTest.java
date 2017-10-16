public class BinaryTreeTest
{
    public static void main (String[] args)
    {
	MyBinaryTree binarytree = new MyBinaryTree ();
	binarytree.setNumberInList(0);
	
	StudentInfo student = new StudentInfo (11, "Elmer", "Fudd");
	binarytree.AddToTree (student, binarytree.getRoot ());
	
	student = new StudentInfo (16, "Daffy", "Duck");
	binarytree.AddToTree (student, binarytree.getRoot ());
	
	student = new StudentInfo (13, "Lola", "Bunny");
	binarytree.AddToTree (student, binarytree.getRoot ());
	
	student = new StudentInfo (5, "Bugs", "Bunny");
	binarytree.AddToTree (student, binarytree.getRoot ());
	
	student = new StudentInfo (2, "Foghorn", "Leghorn");
	binarytree.AddToTree (student, binarytree.getRoot ());
	
	student = new StudentInfo (14, "Tweety", "Bird");
	binarytree.AddToTree (student, binarytree.getRoot ());
	
	student = new StudentInfo (17, "Sylvester", "Cat");
	binarytree.AddToTree (student, binarytree.getRoot ());
	
	student = new StudentInfo (1, "Marvin", "Martian");
	binarytree.AddToTree (student, binarytree.getRoot ());
	
	student = new StudentInfo (12, "Miss", "Prissy");
	binarytree.AddToTree (student, binarytree.getRoot ());
	
	binarytree.PostOrder(binarytree.getRoot() );


    }
}
