package RemoteControl;

import java.io.IOException;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws IOException {

        boolean running = true;

        //create models
        Ship ship = new Ship();
        Plane plane = new Plane();
        Truck truck = new Truck();
        RemoteControl rc;

        Scanner sc = new Scanner(System.in);

        while (running) {

            System.out.println("---Fahrzeugauswahl---");
            System.out.println("[1] - Schiff");
            System.out.println("[2] - Flugzeug");
            System.out.println("[3] - Lastwagen");
            System.out.println("[0] - Programm beenden");
            String option = sc.nextLine();

            switch(option) {
                case "1":
                    System.out.println("Schiff ausgewählt\n");
                    rc = new RemoteControl(ship);
                    rc.steer();
                    break;
                case "2":
                    System.out.println("Flugzeug ausgewählt\n");
                    rc = new RemoteControl(plane);
                    rc.steer();
                    break;
                case "3":
                    System.out.println("Lastwagen ausgewählt\n");
                    rc = new RemoteControl(truck);
                    rc.steer();
                    break;
                case "0":
                    System.out.println("Programm beendet");
                    running = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Bitte wählen Sie die Option mit der jeweiligen Nummer aus");
                    break;
            }
        }
    }
}
