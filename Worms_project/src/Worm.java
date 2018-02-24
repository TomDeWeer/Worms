import be.kuleuven.cs.som.annotate.Basic;
import be.kuleuven.cs.som.annotate.Immutable;

public class Worm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello World!");
		System.err.println((Long.MAX_VALUE));
		System.err.println((Long.MAX_VALUE));
		double notYet = (Long.MAX_VALUE-10);
		System.err.println(notYet/Long.MAX_VALUE);
		System.err.println(notYet/Long.MAX_VALUE == 1);

	}
	
	private double xCoordinate; 
	private double yCoordinate;

	@Basic @Immutable
	public double getXCoordinate() {
		return xCoordinate;
	}
	public void setXCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	@Basic @Immutable
	public double getYCoordinate() {
		return yCoordinate;
	}
	
	public void setYCoordinate(double yCoordinate) { // opletten met overflow?
		this.yCoordinate = yCoordinate;
	}
	
	private double orientation; 
	// keuze: pi is niet voorstelbaar, dus orientatie O als theta = O*2pi
	// met gewoon een double zijn er meer dan genoeg waarden, maar eventueel kan je schalen		

	public double getOrientation() {
		return this.orientation*2*Math.PI;
	}
	public void setOrientation(long orientation) {
		this.orientation = orientation;
	}
	
	public boolean hasValidOrientation() {
		return this.getOrientation()>=0 && this.getOrientation()<1;
	}
	
}
