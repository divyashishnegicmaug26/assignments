package collect;

class EquilateralTriangle implements RegularPolygon {
	int length;
	EquilateralTriangle (int side){
		this.length=side;
	}
	@Override
	public int getNumSides() {
		return 3;
	}
	@Override
	public int getSideLength() {
		return length;
	}
	
}
