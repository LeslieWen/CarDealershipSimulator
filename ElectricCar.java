public class ElectricCar extends Car{
	private int rechargeTime;
	private String batteryType;

	public ElectricCar(String a,String b,int c, int d,int e,int f,double g,boolean h,double i,int j,String k){
		//initialize inherited variables by calling superclass
		super(a,b,c,d,e,f,g,h,i);		
		//New instance variables 
		rechargeTime=j;
		batteryType=k;
	}
	public int getRechargeTime(){
		return rechargeTime;
	}
	public String getBatteryType(){
		return batteryType;
	}

	public void setRechargeTime(int i){
		rechargeTime=i;
	}
	public void setBatteryType(String i){
		batteryType=i;
	}

	public String display(){
		return super.display()+" RCH: "+this.rechargeTime+" BAT: "+this.batteryType;
	}


}