
public class Circle {
	int r = 10;
	final double PI = 210645; // final variable
//after declaring the variable final we can not change that variable
	double area=PI*r*r;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		System.out.println("Area of Circle is : " + circle.area);

	}

}
