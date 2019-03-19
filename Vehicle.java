public class Vehicle{
	/**
	 * @author		Leslie Wen <leslie.wen@ryerson.ca>
	**/

	//Instance Variables
	private String mfr;
	private String color;
	private int power;
	private int numWheels;

	public final int ELECTRIC_MOTOR=0;
	public final int GAS_ENGINE=1;

	//Constructor
	public Vehicle(String a,String b,int c, int d){
		mfr=a;
		color=b;
		power=c;
		numWheels=d;
	}
	/**
	 * manufacturer instance variable getter
	 * @return mfr instance variable	
	**/
	public String getMfr(){
		return mfr;
	}
	/**
	 * manufacturer variable setter
	 * @param String a, String you want to set mfr to
	**/
	public void setMfr(String a){
		mfr=a;
	}
	/** 
	 * color variable getter
	 * @return color instance variable
	**/
	public String getColor(){
		return color;
	}
	/**
	 * color variable setter
	 * @param String a, String you want to set color to
	**/
	public void setColor(String a){
		color=a;
	}
	public String getPower(){
		if(power==0){
			return "ELECTRIC_MOTOR";
		}else if(power==1){
			return "GAS_ENGINE";
		}
		return "";

	}
	public void setPower(int a){
		power=a;
	}
	public int getNumWheels(){
		return numWheels;
	}
	public void setNumWheels(int a){
		numWheels=a;
	}

	//See if two Vehicle objects are equal based on having the same instance variable values
	public boolean equals(Object other){
		Vehicle temp=(Vehicle)other; 
		if(this.mfr==temp.mfr&&this.power==temp.power&&this.numWheels==temp.numWheels){
			return true;
		}else{
			return false;
		}
	}
	//Display Manufacturer and Color labs
	public String display(){
		return this.mfr+" "+this.color;
	}
	

}