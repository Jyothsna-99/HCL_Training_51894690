package lab_assignment_day2_training;

class Car extends Vehicle {
	private int noOfDoor;

	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
		// TODO Auto-generated constructor stub
	}

	public void display() {
		super.display();
		System.out.println("no.of doors :" + getNoOfDoor());

	}

	public int getNoOfDoor() {
		return noOfDoor;
	}
}
