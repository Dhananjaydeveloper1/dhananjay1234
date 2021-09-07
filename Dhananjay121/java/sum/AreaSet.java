package sum;

public class AreaSet {
	int length, breadth;

	AreaSet(int l, int b) {
		length = l;
		breadth = b;
	}

	public int setDim() {
		int results = length * breadth;
		return results;
	}

	public void getArea() {
		System.out.println("Area = " + setDim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaSet x = new AreaSet(6, 8);
		x.getArea();
	}

}
