package collect;

public interface RegularPolygon {
	int getNumSides();
	int getSideLength();
	default int getperamter() {
		return (int)(this.getNumSides()*this.getSideLength());
	}
	default double getangle() {
		return(double)(((this.getNumSides()-2)*3.14)/this.getNumSides());
	}}



