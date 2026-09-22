package collect;

class Square implements RegularPolygon {
	int length;
	Square(int side){
		this.length=side;
	}
	@Override
	public int getNumSides() {
		return 2;
	}
	@Override
	public int getSideLength() {
		return length;
	}
}
