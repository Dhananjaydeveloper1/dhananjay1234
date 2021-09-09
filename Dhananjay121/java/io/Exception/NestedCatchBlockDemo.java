package io.Exception;

public class NestedCatchBlockDemo {
	public static void main(String ar[]) {

		int a = 9;
		int b = 0;

		int array[] = { 1, 2, 3, 4 };

		try {

			try { 

				int c = a * b;
			}

			catch (ArithmeticException e) { 

				System.out.println("come back soon" + e);
			}

			try { 

				System.out.println(array[6]);
			}

			catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("no come back soon" + e);
			}

		}

		catch (ArithmeticException e) { 

			System.out.println("hello world" + e);
		}

	}

}
