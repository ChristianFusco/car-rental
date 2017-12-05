public class SUVFactory implements CarFactory{
	public Car makeCar(){
		return new SUV();
	}
}
