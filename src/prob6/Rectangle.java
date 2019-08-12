package prob6;

public class Rectangle extends Shape implements Resizable {

	public Rectangle(double w, double h) {
		super.setWidth(w);
		super.setHeight(h);
	}
	
	@Override
	public void resize(double s) {
		this.setHeight(this.getHeight()*s);
		this.setWidth(this.getWidth()*s);
	}

	@Override
	public double getArea() {
		return this.getHeight()*this.getWidth();
	}

	@Override
	public double getPerimeter() {
		return (this.getHeight()+this.getWidth())*2;
	}

}
