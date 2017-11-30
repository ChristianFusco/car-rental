class SedanFactory implements CarFactory{
	public Car makeCar(){
		return new Sedan();
	}
}
