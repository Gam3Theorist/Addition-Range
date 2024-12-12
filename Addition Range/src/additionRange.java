import java.util.Scanner;

public class additionRange
	{
		public static void main(String[] args)
			{
				Scanner userIntInput = new Scanner(System.in);
				Scanner userStringInput = new Scanner(System.in);
					{
						System.out.println("Hey. Give me a high number and a low number and Ill tell you what them, and all the numbers between add up to.");
						System.out.println("Whats your high number?");
						int high = userIntInput.nextInt();
						System.out.println("Whats your low number?");
						int low = userIntInput.nextInt();
						int total = low;
						for (int i = low+1; i <= high; i = i + 1)
							{
								total = total + i;
								System.out.println(i);
							}

						System.out.println("Your numbers add up to be "+total);
					}
			}
	}