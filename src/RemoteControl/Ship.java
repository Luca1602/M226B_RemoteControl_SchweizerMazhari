package RemoteControl;

public class Ship implements Movable{

	@Override
	public void start() {
		System.out.println("Schiff erfolgreich gestartet\n");
	}

	@Override
	public void stop() {
		System.out.println("Lastwagen erfolgreich gestoppt\n");
	}

	@Override
	public void turn(int degrees) {
		System.out.println("Lastwagen erfolgreich um " + degrees + " Grad gedreht\n");
	}

	@Override
	public double fuelRemaining() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void changeSpeed(double kmperhour) {
		System.out.println("Geschwindigkeit von Lastwagen auf " + kmperhour + " km/h ge�ndert");
	}

}
