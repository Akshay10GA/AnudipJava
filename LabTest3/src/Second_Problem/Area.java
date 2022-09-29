package Second_Problem;

public class Area implements Shape{

	@Override
	public void RectangleArea(int length, int breadth) {
		int Area = length * breadth;
		System.out.println("Area of Rectangle is : "+Area);
		
	}

	@Override
	public void SquareArea(int side) {
		int Area = side * side;
		System.out.println("Area of Square is : "+Area);
		
	}

	@Override
	public void CircleArea(int radius) {
		int Area = (int) (3.14 * (radius * radius));
		System.out.println("Area of Circle is : "+Area);
		
	}
	
	
}
