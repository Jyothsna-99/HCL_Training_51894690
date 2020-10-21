package lab_assignment_day2_training;

public class Q1 {
	private double radius;
	 private String color;
	 
	 public Q1() {
		 radius=1.0;
		 color="red";
	 }
	 public Q1(double r) { 
	      radius = r;
	      color = "red";
	   }
	   public double getRadius() {
	     return radius; 
	   }
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Q1 q=new Q1();
	System.out.println("the radius of circle is"+q.getRadius()+" the area of circle is "+q.getArea());	 
	}

}
