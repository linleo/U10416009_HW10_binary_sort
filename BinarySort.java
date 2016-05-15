public class BinarySort<E extends Comparable<E>>
{
	TreeNode<E> root;
	int size = 0;
	
	//constructor
	BinarySort(){}
	BinarySort(E[] objects)
	{
		for (int i = 0; i < objects.length; i++)
			insert(objects[i]);
	}
	
	//call have parameter's inorder method
	void inorder()
	{
		inorder(root);
	}
	
	//print after inorder
	void inorder(TreeNode<E> root) 
	{
		if (root == null) 
			return;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}
	
	//insert the element to the binary tree
	void insert(E e) 
	{
		if (root == null)
			root = new TreeNode<>(e);
		else
		{
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null)
			{
				if (e.compareTo(current.element) <= 0) 
				{
					parent = current;
					current = current.left;
				}
				else 
				{
					parent = current;
					current = current.right;
				}
			}
			if (e.compareTo(parent.element) <= 0)
				parent.left = new TreeNode<>(e);
			else
				parent.right = new TreeNode<>(e);
		}

		size++;
	}
	
	//inner class of tree node
	private static class TreeNode<E extends Comparable<E>>
	{
		protected E element;
		protected TreeNode<E> left;
		protected TreeNode<E> right;
		
		TreeNode(E e)
		{
			element = e;
		}
	}
}
