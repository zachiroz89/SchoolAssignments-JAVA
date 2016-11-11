//package School.Chapter11exercise11;


class Triangle2 extends GeometricFigure2 {
	public Triangle2() {
		super();
		this.figureType="Triangle";
                this.numberSides="3";
		getArea(height, width);
		display();
		
	}
	public void getArea(String height, String width){
		int h = Integer.parseInt(height);
		int w = Integer.parseInt(width);
		area=(h*w)/2;
	}
	public void display(){
		   System.out.println(this.figureType + " Number of sides:"+numberSides);
		}

}