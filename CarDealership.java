import java.util.*;

public class CarDealership{
	//Instance Variables
	private ArrayList <Car> Cars; 	
	private boolean ElectricFilter=false;
	private boolean AWDFilter=false;
	private boolean PriceFilter=false;
	private double minPrice;
	private double maxPrice;
	
	private Car lastCar;

	//Constructor
	public CarDealership(){
		ArrayList <Car> EmptyArr = new ArrayList <Car>(); // Empty Arraylist
		Cars=EmptyArr;
	}
	public void addCars(ArrayList <Car> newCars){
		Cars.addAll(newCars);
	}
	public Car buyCar(int index){
		if(index>Cars.size()-1){
			return null;
		}else{
			lastCar=Cars.get(index);
			Cars.remove(Cars.get(index));
			return lastCar;
		}
	}
	public Car returnLastCar(){
		return lastCar;	
	}

	public void returnCar(Car car){
		if(car!= null){
			Cars.add(car);
		}
		if(car==null){
			System.out.println("You already returned the car");
		}
		lastCar=null;
	}
	public void displayInventory(){
		System.out.println("--------------------------------------------------------------------------------------------------");	
		System.out.println("| INDEX | MANUFACTURER | COLOUR | MODEL | RANGE | SAFETY RATING | AWD | PRICE | RECHARGE | BATTERY");	
		for(int i=0; i<Cars.size();i++){
			
			if(ElectricFilter==false&&AWDFilter==false&&PriceFilter==false){
				System.out.print(i+" ");
				System.out.print(Cars.get(i).display()+'\n');
			}else if(ElectricFilter==true&&AWDFilter==false&&PriceFilter==false){
				if(Cars.get(i).getPower().equals("ELECTRIC_MOTOR")){
					System.out.print(i+" ");
					System.out.print(Cars.get(i).display()+'\n');
				}
			}else if(ElectricFilter==true&&AWDFilter==false&&PriceFilter==true){
				if(Cars.get(i).getPower()=="ELECTRIC_MOTOR"&&minPrice<=Cars.get(i).getPrice()==true
				 && Cars.get(i).getPrice()<=maxPrice==true){	
				 				System.out.print(i+" ");
								System.out.print(Cars.get(i).display()+'\n');
				}
			}else if(ElectricFilter==true&&AWDFilter==true&&PriceFilter==false){
				if(Cars.get(i).getPower()=="ELECTRIC_MOTOR"&&Cars.get(i).getAWD()==true){
					System.out.print(i+" ");
					System.out.print(Cars.get(i).display()+'\n');
				}
			}else if(ElectricFilter==true&&AWDFilter==true&&PriceFilter==true){
				if(Cars.get(i).getPower()=="ELECTRIC_MOTOR"&&Cars.get(i).getAWD()==true
					&&PriceFilter==true&&minPrice<=Cars.get(i).getPrice()==true && Cars.get(i).getPrice()<=maxPrice==true){
					System.out.print(i+" ");
					System.out.print(Cars.get(i).display()+'\n');
				}
			}else if(ElectricFilter==false&&AWDFilter==true&&PriceFilter==false){
				if(Cars.get(i).getAWD()==true){
					System.out.print(i+" ");
					System.out.print(Cars.get(i).display()+'\n');
				}
			}
			else if(ElectricFilter==false&&AWDFilter==true&&PriceFilter==true){
				if(Cars.get(i).getAWD()==true&&PriceFilter==true&&minPrice<=Cars.get(i).getPrice()==true 
					&& Cars.get(i).getPrice()<=maxPrice==true){
					System.out.print(i+" ");
					System.out.print(Cars.get(i).display()+'\n');
				}
			}
			else if(ElectricFilter==false&&AWDFilter==false&&PriceFilter==true&&minPrice<=Cars.get(i).getPrice()==true 
				&& Cars.get(i).getPrice()<=maxPrice==true){
				System.out.print(i+" ");
				System.out.print(Cars.get(i).display()+'\n');
			}
		}
	}
	public void filterByElectric(){
		ElectricFilter=true;
	}
	public void filterByAWD(){
		AWDFilter=true;
	}
	public void filterByPrice(double minPrice, double maxPrice){
		PriceFilter=true;
		this.minPrice=minPrice;
		this.maxPrice=maxPrice;
	}
	public void filtersClear(){
		ElectricFilter=false;
		AWDFilter=false;
		PriceFilter=false;
	}
	public void sortByPrice(){
		Collections.sort(Cars);
	}

	public class safetyRatingHelper implements Comparator<Car>{
		public safetyRatingHelper(){

		}
		public int compare(Car a1,Car other){
			if(a1.getSafetyRating()>other.getSafetyRating()){
				return 1;
			}else if(a1.getSafetyRating()<other.getSafetyRating()){
				return -1;
			}else{
				return 0;
			}
			
		}

		
	}	
	public void sortBySafetyRating(){
		Collections.sort(Cars,new safetyRatingHelper());
	}

	public class maxRangeHelper implements Comparator<Car>{
		public maxRangeHelper(){

		}
		public int compare(Car a1,Car other){
			if(a1.getMaxRange()>other.getMaxRange()){
				return 1;
			}else if(a1.getMaxRange()<other.getMaxRange()){
				return -1;
			}else{
				return 0;
			}
			
		}
		
	}

	public void sortByMaxRange(){
		Collections.sort(Cars, new maxRangeHelper());
	}


}