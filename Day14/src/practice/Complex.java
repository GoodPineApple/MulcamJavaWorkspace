package practice;

public class Complex {
	private double real;
	private double imag;

	public Complex(double r, double i) {
		real = r;
		imag = i;
	}
	
	public String toString() {
		return real + ", " + imag;
	}

	double getReal() {
		return real;
	}

	double getImag() {
		return imag;
	}

	public Complex add(Complex c) {
		double resultReal = real + c.getReal();
		double resutlImag = imag + c.getImag();
		return new Complex(resultReal, resutlImag);
	}

	public static void main(String[] args) {
		Complex one = new Complex(1, 0.54);
		Complex two = new Complex(5, 0.46);
		
		double result;
		
		System.out.println(one.add(two));

	}
}
