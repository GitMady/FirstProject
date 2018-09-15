package inheritance;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	HondaCivic[] myCar = new HondaCivic[3];
		myCar[0] = new HondaCivic("HondaCivic","Sedan");
		myCar[1] = new HondaCivic("HondaCivic","Hatchback");
		myCar[2] = new HondaCivic("HondaCivic","SUV");
		for (HondaCivic hc:myCar)
		{
			System.out.println(hc.getModel() + " " + hc.getType());
		}
		*/
	
		Car[] myCar = new Car[3];
		myCar[0] = new Car("HondaCivic","Sedan");
		myCar[1] = new Car("HondaCivic","Hatchback");
		myCar[2] = new Car("HondaCivic","SUV");
		for (Car hc:myCar)
		{
			System.out.println(hc.getModel() + " " + hc.getType());
		}
		
	
	}

}
