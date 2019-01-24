package RemoteControl;

public class Truck implements Movable{

	boolean isRunning = false;
	double fuel = 100.0;

	@Override
	public void start() {
		if (!isRunning) {
			System.out.println("Lastwagen erfolgreich gestartet\n");
			isRunning = true;
		}
		else {
			System.out.println("Lastwagen wurde bereits gestartet\n");
		}
	}

	@Override
	public void stop() {
		if (isRunning) {
			System.out.println("Lastwagen erfolgreich gestoppt\n");
			isRunning = false;
		}
		else {
			System.out.println("Lastwagen wurde noch nicht gestartet\n");
		}
	}

	@Override
	public void turn(int degrees) {
		if (isRunning) {
			System.out.println("Lastwagen erfolgreich um " + degrees + " Grad gedreht\n");
		}
		else {
			System.out.println("Lastwagen zuerst starten um Richtung zu ändern\n");
		}
	}

	@Override
	public double fuelRemaining() {
		fuel = fuel-10;
		return fuel;
	}

	@Override
	public void changeSpeed(double kmperhour) {
		if (isRunning) {
			System.out.println("Geschwindigkeit von Lastwagen auf " + kmperhour + " km/h geändert\n");
		}
		else {
			System.out.println("Lastwagen zuerst starten um Geschwindigkeit zu ändern\n");
		}
	}


}
