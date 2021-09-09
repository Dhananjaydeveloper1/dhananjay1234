package io.Exception;

public class ArrayIndexOutofBoundDemo {
	public static void main(String args[]) {
		int array[] = { 1, 2, 3, 4, 6 };

		try {

			System.out.println(array[5]);
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(" techical problem .come back soon" + e);
		}

	}
}
