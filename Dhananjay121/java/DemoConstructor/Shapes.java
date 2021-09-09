package DemoConstructor;

public class Shapes {

	private double dimOne;
	private double dimTwo;
	private double dimThree;

	// 1 arg constructor
	public Shapes(double dim1) {
		dimOne = dim1;
	}

	// 2 arg constructor
	public Shapes(double dim1, double dim2) {
		dimOne = dim1;
		dimTwo = dim2;
	}

	// 3 arg constructor
	public Shapes(double dim1, double dim2, double dim3) {
		dimOne = dim1;
		dimTwo = dim2;
		dimThree = dim3;
	}

	// Setters and getters:
	// dim 1
	public void setDimOne(double dim1) {
		dimOne = dim1;
	}

	public double getDimOne() {
		return dimOne;
	}

	// dim2
	public void setDimTwo(double dim2) {
		dimTwo = dim2;
	}

	public double getDimTwo() {
		return dimTwo;
	}

	// dim3
	public void setDimThree(double dim3) {
		dimThree = dim3;
	}

	public double getDimThree() {
		return dimThree;
	}

	public double getArea() {
		return 0;
	}

	public String getName() {
		return getClass().getName();
	}

	@Override
	public String toString() {
		return "area = " + getArea();
	}

	public static void main(String args[]) {
		
	}

}
