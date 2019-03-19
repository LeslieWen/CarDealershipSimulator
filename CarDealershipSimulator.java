import java.util.ArrayList;
import java.util.Scanner;

public class CarDealershipSimulator 
{

  private static int lastCarIndex;

  public static void main(String[] args)
  {
	  // Create a CarDealership object
	  CarDealership c = new CarDealership(); 	  

	  ArrayList<Car> EmptyArr = new ArrayList<Car>();

	  //MFR Color Power numWheels model range, safety rating awd price, charging time batterytype
	  Car firstCar = new Car("Toyota","blue",1,4,0,500,9.5,false,25000);
	  Car secondCar = new Car("Honda","red",1,4,2,450,9.2,false,30000);
	  Car thirdCar = new Car("Kia","white",1,4,3,550,9.7,false,20000);
	  Car fourthCar = new Car("BMW","black",1,4,0,600,9.6,true,55000);
	  Car fifthCar = new ElectricCar("Tesla","red",0,4,0,425,9.1,true,85000,30,"Lithium"); 
	  Car sixthCar =  new Car("Chevy","red",1,4,3,475,9.25,false,40000);
	  Car seventhCar = new ElectricCar("ChevyVolt","green",0,4,0,375,8.9,true,37000,45,"Lithium");
	  Car eighthCar = new Car("Bentley","black",1,4,0,575,9.8,false,150000);
	  Car ninthCar = new ElectricCar("NissanLeaf","green",0,4,0,325,8.8,true,32000,55,"Lithium");

	  EmptyArr.add(firstCar);
	  EmptyArr.add(secondCar);
	  EmptyArr.add(thirdCar);
	  EmptyArr.add(fourthCar);
	  EmptyArr.add(fifthCar);
	  EmptyArr.add(sixthCar);
	  EmptyArr.add(seventhCar);
	  EmptyArr.add(eighthCar);
	  EmptyArr.add(ninthCar);

	    

	  // Then create an (initially empty) array list of type Car
      // Then create some new car objects of different types
	  // See the cars file for car object details
	  // Add the car objects to the array list
      // The ADD command should hand this array list to CarDealership object via the addCars() method	  
	  
	  // Create a scanner object
	  Scanner scanner = new Scanner(System.in);
	  while(scanner.hasNext()){
	  	
	  	Scanner commandLine = scanner;
	  	String s = commandLine.nextLine();
	  	s = s.toUpperCase();
	  	try{
		if(s.equals("L")){
			c.displayInventory();
			
		}else if(s.equals("Q")){
			System.exit(0);
		}else if(s.equals("BUY")){
			lastCarIndex = commandLine.nextInt();
			c.buyCar(lastCarIndex);
		}else if(s.equals("RET")){
			c.returnCar(c.returnLastCar());
		}else if(s.equals("ADD")){
			c.addCars(EmptyArr);	
		}else if(s.equals("SPR")){ // sort by price
			c.sortByPrice();
		}else if(s.equals("SSR")){ // sort by safety rating
			c.sortBySafetyRating();
		}else if(s.equals("SMR")){
			c.sortByMaxRange();
		}else if(s.equals("FPR")){ // filter by price
			double d1=commandLine.nextDouble();
			double d2=commandLine.nextDouble();
			c.filterByPrice(d1,d2);

		}else if(s.equals("FEL")){ // filter non-electric cars out
			c.filterByElectric();
		}else if(s.equals("FAW")){ // filter non all wheel drive cars out
			c.filterByAWD();
		}else if(s.equals("FCL")){ // clear all filters
			c.filtersClear();
		}else{
			throw new IllegalAccessException("Must input a valid command");
		}
		}	
		catch (IllegalAccessException i){
			System.out.println("Invalid command detected. Try again.");
		}
		


	  }




	  // while the scanner has another line
	  //    read the input line
	  //    create another scanner object (call it "commandLine" or something) using the input line instead of System.in
	  //    read the next word from the commandLine scanner 
      //	check if the word (i.e. string) is equal to one of the commands and if so, call the appropriate method via the CarDealership object  
	 
  }
}