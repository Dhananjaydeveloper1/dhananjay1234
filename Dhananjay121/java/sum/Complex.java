package sum;

	public class Complex { 
		private final double real; 
		private final double imaginary; 
	 public Complex(double real, double imaginary) { 
		 this.real = real; 
		 this.imaginary = imaginary; 
		 }
	 //addition
	 public Complex sum(Complex other) {
		 double r = this.real + other.real; 
		 double i = this.imaginary + other.imaginary; 
		 return new Complex(r, i); 
		 }

	 //difference
	 public Complex difference(Complex other) {
		 double r = this.real - other.real;
		 double i = this.imaginary - other.imaginary;
		 return new Complex(r, i); 
		 }
	 //multiplication
	 public Complex multiplication(Complex other) {
		 double r = this.real * other.real;
		 double i = this.imaginary * other.imaginary;
		 return new Complex(r, i); 
		 }
	public double getReal() {
		return real; 
		} 
	public double getImaginary() {
		return imaginary; 
		} 
	@Override 
	public String toString() {
		return real + " + " + imaginary + "i"; 
		} 
	}
	class Main {
		public static void main(String[] args) { 
			// first complex number 
			Complex c1 = new  Complex(2, 4); 
			// Second complex number
			Complex c2 = new Complex(3, 5);
			Complex sum = c1.sum(c2); 
			Complex difference = c1.difference(c2);
			Complex multiplication = c1.multiplication(c2);
			System.out.println("first complex number: " + c1); 
			System.out.println("second complex number: " + c2); 
			System.out.println("sum of two complex numbers: " + sum); 
			System.out.println("difference of two complex numbers: " + difference);
			System.out.println("multiplication of two complex numbers: " + multiplication);
	        }
	}

