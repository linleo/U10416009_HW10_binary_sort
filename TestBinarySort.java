import java.security.SecureRandom;

public class TestBinarySort
{
	public static void main(String args[])
	{
		//random
		SecureRandom srand = new SecureRandom();
		//array for integer
		Integer number[] = new Integer[20];
		System.out.println("Before inorder : ");
		//assign a random number to array
		for (int i = 0; i < 20; i++)
		{
			number[i] = srand.nextInt(100) + 1;
			System.out.print(number[i] + " ");
		}
		BinarySort<Integer> binarySort = new BinarySort<>(number);
		System.out.println("\nAfter inorder : ");
		//print result
		binarySort.inorder();
	}
}
