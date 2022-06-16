package ua.lviv.homework;

public class Car {
	
	@MyAnnotation(" car manufacturer ")
	private String producer;
	@MyAnnotation(" car model ")
    private String model;
	@MyAnnotation(" year of manufacturing ")
    private String year;
    
	public Car(String producer, String model, String year) {
		super();
		this.producer = producer;
		this.model = model;
		this.year = year;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [producer=" + producer + ", model=" + model + ", year=" + year + "]";
	}
    
    

}
