package RemoteControl;

public class Ship implements Movable{

	boolean isRunning = false;
	double fuel = 100.0;

	@Override
	public void start() {
		if (!isRunning) {
			System.out.println("Schiff erfolgreich gestartet\n");
			isRunning = true;
		}
		else {
			System.out.println("Schiff wurde bereits gestartet\n");
		}
	}

	@Override
	public void stop() {
		if (isRunning) {
			System.out.println("Schiff erfolgreich gestoppt\n");
			isRunning = false;
		}
		else {
			System.out.println("Schiff wurde noch nicht gestartet\n");
		}
	}

	@Override
	public void turn(int degrees) {
		if (isRunning) {
			System.out.println("Schiff erfolgreich um " + degrees + " Grad gedreht\n");
		}
		else {
			System.out.println("Schiff zuerst starten um Richtung zu ändern\n");
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
			System.out.println("Geschwindigkeit von Schiff auf " + kmperhour + " km/h geändert\n");
		}
		else {
			System.out.println("Schiff zuerst starten um Geschwindigkeit zu ändern\n");
		}
	}

}
