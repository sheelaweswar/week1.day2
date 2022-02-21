package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		int valAdd;
		int valSub;
		float divVal;
		double mulVal;
		
		Calculator objCal = new Calculator();
		valAdd = objCal.addMthd(1,2,3);
		valSub = objCal.subMthd(5,2);
		mulVal = objCal.mulMthd(2.5,2.5);
		divVal = objCal.divideMthd(5, 2);
		
		System.out.println("Add method Value: "+valAdd );
		System.out.println("Sub method Value: "+valSub );
		System.out.println("Multiplication method Value: "+mulVal );
		System.out.println("Divide method Value: "+divVal );
	}
}
