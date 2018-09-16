package inheritance;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car[] myCar = new Car[3];
		myCar[0] = new Car("HondaCivic","Sedan");
		myCar[1] = new Car("HondaCivic","Hatchback");
		myCar[2] = new Car("HondaCivic","SUV");
			
		for (Car hc:myCar)
		{
			System.out.println(hc.getModel() + " " + hc.getType());
			if (hc.getModel().equals("HondaCivic")) 
				System.out.println("this is the changes from personal laptop");
			   
		}
		
		
	}

}
