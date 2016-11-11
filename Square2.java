//package School.Chapter11exercise11;

class Square2 extends GeometricFigure2{
    public Square2() {
	super();
	this.figureType="Square";
        this.numberSides="4";
	getArea(height, width);
	display();
		
    }
    public void getArea(String height, String width){
	int h = Integer.parseInt(height);
	int w = Integer.parseInt(width);
	area=h*w;
    }
    public void display(){
       System.out.println(this.figureType + " Number of sides:"+numberSides);
    }
}