package test3;
import test3.taxPerson;
public class Main {

	public static void main(String[] args) {
		String[] args1 = {"Luxury","100"};
		taxPerson tp = new taxPerson(args1);
		tp.afterTax();

	}

}
