package io.Exception;

public class FinallyDemo {
	public static void main(String ar[]) {

		int a = 6;
		int b = 0;

		int array[] = { 1, 2, 3, 4 ,5,7};

		try {// outer try

			try { // inner try

				int c = a / b;
				// System.out.println(c);
			}

			catch (ArithmeticException e) { // innerc catch bloc

				System.out.println("some technical issue" + e);
			}

			try { 

				System.out.println(array[6]);
			}

			catch (ArrayIndexOutOfBoundsException e) { 

				System.out.println("some technical issue" + e);
			}

		}

		catch (ArithmeticException e) { // outer catch

			System.out.println("some technical issue " + e);
		}

		finally {

			System.out.println("Message from finally block");

		}

	}
}
