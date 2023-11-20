package superkeywordlecture;


class Box{
	double height;
	double width;
	double length;
	
	Box(double localHeight, double localWidth, double localLength)
	{
		this.height=localHeight;
		this.width=localWidth;
		this.length=localLength;
	}
	
	void volumeOfBox()
	{
		double volume=height*width*length;
		System.out.println("Volume of Box: " +volume);
	}
}

class BoxWeight extends Box{
	double weight;
	
	public BoxWeight(double pHeight, double pLength, double pWidth, double pWeight) {
		//Below line initializes the attributes of super/parent class
		//and is an example of invoking parent class constructor through super()
		super(pHeight, pWidth, pLength);
		
		this.weight=pWeight;
	}
	
	void displayWeight()
	{
		System.out.println("Weight of the box: "+ weight);
	}
}

public class SuperConstructorClass {

	public static void main(String[] args) {
		BoxWeight box1= new BoxWeight(10, 15, 20, 50);
		box1.volumeOfBox();
		box1.displayWeight();

	}

}
