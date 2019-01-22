package RemoteControl;

public interface Movable {

	void start ();
	void stop ();
	void turn (int degrees);
	double fuelRemaining ();
	void changeSpeed (double kmperhour);

}
