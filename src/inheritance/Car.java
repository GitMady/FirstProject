package inheritance;

public class Car {

	private String model;
	private String type; // sedan, hatchback, suv, convertible, coupe

	public Car(String model, String type) {
		this.model = model;
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

}