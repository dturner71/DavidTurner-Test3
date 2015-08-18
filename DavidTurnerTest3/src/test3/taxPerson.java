package test3;

import java.util.List;
import java.util.Arrays;

public class taxPerson extends Library {
	private	boolean luxuryItem;
	private	int costInCents;

	public taxPerson(String[] input) {
		List<String> inputList = Arrays.asList(input);
		if (input.length!=2){
			log("Incorct number of paramaters please enter Luxury or Staple and cost in cents");
			System.exit(0);
		}
		if (inputList.contains("Luxury")){
			luxuryItem=true;
		} else if (inputList.contains("Staple")) {
			luxuryItem=false;
		} else {
			log("Please enter Luxury or Staple");
			System.exit(0);
		}
		try {
			costInCents = Integer.parseInt(inputList.get(1)); 
		} catch (Exception e) {
			log("Please enter in format Type then cost in pennies");
			log("do not incluse . or $");
			System.exit(0);
		}
	}

	public int afterTax (){
		int newPrice=0;
		if (luxuryItem){
			newPrice= (int)  Math.round(costInCents*1.09);
			log("Luxuary Item: Old price: " + costInCents + " New price: " +newPrice);
		}else{
			newPrice= (int)  Math.round(costInCents*1.01);
			log("Luxuary Item: Old price: " + costInCents + " New price: " +newPrice);
		}
		return newPrice;
	}
}
