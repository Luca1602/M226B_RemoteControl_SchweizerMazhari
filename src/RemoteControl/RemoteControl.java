package RemoteControl;

import java.io.IOException;
import java.util.Scanner;

public class RemoteControl {

	private Movable machine;
	boolean running = true;

	public RemoteControl(Movable m) {
		machine = m;
	}

	public void steer() throws IOException {
		Scanner sc = new Scanner(System.in);
		while (running) {

			System.out.println("[1] Objekt starten");
			System.out.println("[2] Objekt stoppen");
			System.out.println("[3] Richtung von Objekt ändern");
			System.out.println("[4] Treibstoffkontrolle");
			System.out.println("[5] Geschwindigkeitsaenderung");
			System.out.println("[6] zurueck zur Fahrzeugauswahl");
			String option = sc.nextLine();
			switch ( option ) {
				case "1":
					machine.start();
					break;
				case "2":
					machine.stop();
					break;
				case "3":
					System.out.println("Richtung um wieviel Grad drehen?");
					int degrees = Integer.parseInt(sc.nextLine());
					machine.turn(degrees);
					break;
				case "4":
					System.out.println("Treibstoff in %: " + machine.fuelRemaining());
					break;
				case "5":
					System.out.println("Geschwindigkeit auf wieviele km/h ändern?");
					double speed = Double.parseDouble(sc.nextLine());
					machine.changeSpeed(speed);
					break;
				case "6":
					sc.close();
					running = false;
					break;
				default:
					System.out.println("Bitte wählen Sie die Option mit der jeweiligen Nummer aus");
			}
		}
	}
}
