import java.security.SecureRandom;

public class TestBinarySort
{
	public static void main(String args[])
	{
		SecureRandom srand = new SecureRandom();
		Integer number[] = new Integer[20];
		System.out.println("Before inorder : ");
		for (int i = 0; i < 20; i++)
		{
			number[i] = srand.nextInt(100) + 1;
			System.out.print(number[i] + " ");
		}
		BinarySort<Integer> binarySort = new BinarySort<>(number);
		System.out.println("\nAfter inorder : ");
		binarySort.inorder();
	}
}
