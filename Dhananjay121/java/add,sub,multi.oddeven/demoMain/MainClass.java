package demoMain;

import comAdd.AdditionService;
import comDiv.DivideService;
import comMulti.MultiplicationService;
import comSub.SubtractionService;
import comevenodd.EvenOdd;

public class MainClass {
public static void main(String args[]){
	//object create addition
	AdditionService addition=new AdditionService();
	int resutadd =addition.perfromaddition(4,7);
	System.out.println("addition="+resutadd);
	//object create subtraction
	SubtractionService subtraction =new 	SubtractionService();
	int resutsub=subtraction.performsubtraction(7,5);
	System.out.println("subtraction="+resutsub);
	//object create multiplication
	MultiplicationService multiplication =new MultiplicationService();
	int resutmult=multiplication.perfrommultiplication(4, 6);
	System.out.println("multiplication=" + resutmult);
	
	//object create divide
	DivideService divide=new DivideService();
	int resutdiv=divide.perfromdivide(10, 5);
	System.out.println("divide="+ resutdiv);
	
	//object create evenodd
		EvenOdd evenodd=new EvenOdd();
		evenodd.EvenOddnumber(5);
	}
	
}

