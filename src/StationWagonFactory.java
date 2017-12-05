public class StationWagonFactory implements CarFactory{
	public Car makeCar(){
		return new StationWagon();
	}
}
