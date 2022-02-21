package week1.day2;

public class Calculator {

	public int addMthd(int num1, int num2, int num3) {	
		int addVal = num1+num2+num3;
		return (addVal);
	}

	public int subMthd(int num1,int num2) {
		int subVal = num1 - num2;
		return (subVal);
	}

	public double mulMthd(double num1, double num2) { 
		double mulVal= num1 * num2;
		return (mulVal);
	}

	public float divideMthd(float num1, float num2) {
		float divVal =num1/num2;
		return (divVal);
	}

	/* public static void main(String[] args) {
		Calculator objcal = new Calculator();
		objcal.addMthd(1,2,3);
		objcal.subMthd(5,2);
		objcal.mulMthd(2.5,2.5);
		objcal.divideMthd(5, 2);
	} */
}
