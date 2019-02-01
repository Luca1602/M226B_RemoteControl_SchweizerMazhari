package RemoteControl;

public class Plane implements Movable{

	boolean isRunning = false;
	double fuel = 100.0;

	@Override
	public void start() {
		if (!isRunning) {
			System.out.println("Flugzeug erfolgreich gestartet\n");
			isRunning = true;
		}
		else {
			System.out.println("Flugzeug wurde bereits gestartet\n");
		}
	}

	@Override
	public void stop() {
		if (isRunning) {
			System.out.println("Flugzeug erfolgreich gestoppt\n");
			isRunning = false;
		}
		else {
			System.out.println("Flugzeug wurde noch nicht gestartet\n");
		}
	}

	@Override
	public void turn(int degrees) {
		if (isRunning) {
			System.out.println("Flugzeug erfolgreich um " + degrees + " Grad gedreht\n");
		}
		else {
			System.out.println("Flugzeug zuerst starten um Richtung zu ändern\n");
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
			System.out.println("Geschwindigkeit von Flugzeug auf " + kmperhour + " km/h geändert\n");
		}
		else {
			System.out.println("Flugzeug zuerst starten um Geschwindigkeit zu ändern\n");
		}
	}


}
