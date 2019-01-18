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
		do {
			System.out.println("Menue-Auswahl: ");
			System.out.println("[1] Objekt starten");
			System.out.println("[2] Objekt stoppen");
			System.out.println("[3] Objekt Richtungaendern");
			System.out.println("[4] Treibstoffkontrolle");
			System.out.println("[5] Geschwindigkeitsaenderung");
			System.out.println("[0] beenden");
			String option = sc.nextLine();
			switch ( option ) {
				case "1":
					machine.start();
					break;
				case "2":
					machine.stop();
					break;
				case "3":
					machine.turn(10);
				case "4":
					System.out.println("Treibstoff in %:"
					+ machine.fuelRemaining());
					break;
				case "5":
					System.out.println("Geschwindigkeit auf wieviele km/h ändern?");
					int speed = sc.nextInt();
					machine.changeSpeed(speed);
				case "0":
					System.out.println("Program closed...");
					sc.close();
					running = false;
			}
		} while (running);
	}
}
