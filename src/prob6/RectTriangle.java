package prob6;

public class RectTriangle extends Shape{
	
	public RectTriangle(double w, double h) {
		super.setWidth(w);
		super.setHeight(h);
	}
	
	@Override
	public double getArea() {
		
		return super.getHeight()*super.getWidth()*1/2;
	}

	@Override
	public double getPerimeter() {
		return super.getHeight()+super.getWidth()+
				Math.sqrt(super.getHeight()*super.getHeight()+super.getWidth()*super.getWidth());
	}
	

}
