import java.awt.geom.*;

class Square extends GeometricFigure{
	public Square() {
		super();
		this.figureType="Square";
		getArea(height, width);
		display();
		
	}
	public void getArea(String height, String width){
		int h = Integer.parseInt(height);
		int w = Integer.parseInt(width);
		area=h*w;
	}
	public void display(){
		System.out.println(this.figureType + " Area:"+ area);
	}


}