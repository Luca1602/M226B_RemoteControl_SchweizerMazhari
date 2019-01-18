package RemoteControl;

public interface Movable {
	
	public boolean start();
	public void stop();
	public void changeDirection(String direction);
	public int showFuel();
	
}
