package inheritance;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car[] myCar = new Car[4];
		myCar[0] = new Car("HondaAccord","Car");
		myCar[1] = new Car("HondaCivic","Small Car");
		myCar[2] = new Car("HondaCRV","SUV");
		myCar[3] = new Car("HondaOdyssy","Mini Van");
		for (Car hc:myCar)
		{
			System.out.println(hc.getModel() + " " + hc.getType());
		}
		
	}

}
