public class Car extends Vehicle implements Comparable<Car>{
	
	private int model;
	private int maxRange;
	private double safetyRating;
	private boolean AWD; 
	private double price;
	
	public final int SEDAN=0;
	public final int SUV=1;
	public final int SPORTS=2;
	public final int MINIVAN=3;

	public Car(String a,String b,int c,int d,int e,int f,double g,boolean h,double i){
		super(a,b,c,d);
		model=e;
		maxRange=f;
		safetyRating=g;
		AWD=h;
		price=i;
	}
	public String getModel(){
		if(model==0){
			return "SEDAN";
		}else if(model==1){
			return "SUV";
		}else if(model==2){
			return "SPORTS";
		}else if(model==3){
			return "MINIVAN";
		}
		return "";

	}
	public int getMaxRange(){
		return maxRange;
	}	
	public double getSafetyRating(){
		return safetyRating;
	}
	public boolean getAWD(){
		return AWD;
	}
	public double getPrice(){
		return price;
	}
	public void setModel(int a){
		model=a;
	}
	public void setMaxRange(int a){
		maxRange=a;
	}
	public void setSafetyRating(double a){
		safetyRating=a;
	}
	public void setAWD(boolean a){
		AWD=a;
	}
	public void setPrice(double a){
		price=a;
	}

	public String display(){
		String ans=super.display()+" "+this.getModel()+" RNG: "+this.maxRange+" SF: "+this.safetyRating+" AWD: "+this.AWD+" $"+this.price;
		return ans;
	}
	
	public boolean equals(Object other){
		boolean state=false;
		Car temp=(Car)other;
		if(this.getMfr()==temp.getMfr()&&this.getPower()==temp.getPower()&&this.getNumWheels()==temp.getNumWheels()
			&&this.model==temp.model&&this.AWD==temp.AWD){
			state=true;
		}
		return state;
	}

	public int compareTo(Car other){
		
		if(this.price>other.price){
			return 1;
		}else if(this.price<other.price){
			return -1;
		}else if(this.price==other.price){
			return 0;
		}
		return 100;
	}


}