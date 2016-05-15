public class BinarySort<E extends Comparable<E>>
{
	TreeNode<E> root;
	int size = 0;
	
	BinarySort(){}
	BinarySort(E[] objects)
	{
		for (int i = 0; i < objects.length; i++)
			insert(objects[i]);
	}
	
	void inorder() 
	{
		inorder(root);
	}
	
	void inorder(TreeNode<E> root) 
	{
		if (root == null) 
			return;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}
	
	boolean insert(E e) 
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
				else if (e.compareTo(current.element) > 0) 
				{
					parent = current;
					current = current.right;
				}
				else
			  	return false;
			}
			if (e.compareTo(parent.element) < 0)
				parent.left = new TreeNode<>(e);
			else
				parent.right = new TreeNode<>(e);
		}

		size++;
		return true;
	}
	
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
