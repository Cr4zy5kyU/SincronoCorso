package it.sincrono.geometry;

public class Hexagon extends RegularPoligon {

	public Hexagon(Integer sides, Double sideLength) {
		super(sides, sideLength);
	}

	public static Double computeWidth(Double side) {
		return side * Math.sqrt(3);
	}
	
	@Override
	protected Double computeHeight() {
		return null;
	}

	@Override
	protected Double computeWidth() {
		return computeWidth(sideLength);
	}

	@Override
	protected Double computeArea() {
		return null;
	}

	@Override
	public void setSideLength(Double sideLength) {

	}

}
