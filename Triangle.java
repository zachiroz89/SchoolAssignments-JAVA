class Triangle extends GeometricFigure {
	public Triangle() {
		super();
		this.figureType="Triangle";
		getArea(height, width);
		display();
		
	}
	public void getArea(String height, String width){
		int h = Integer.parseInt(height);
		int w = Integer.parseInt(width);
		area=(h*w)/2;
	}
	public void display(){
		System.out.println(this.figureType + " Area:"+ area);
	}


}