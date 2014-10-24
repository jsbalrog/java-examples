/**
 * Guitar simulator.
 */
public class GuitarSim {
	public static void main(String[] args) {
		Guitar acousticGuitar = new AcousticGuitar();
		Guitar electricGuitar = new ElectricGuitar();
		Guitar rockBandGuitar = new RockBandGuitar();

		acousticGuitar.performSound();
		electricGuitar.performSound();
		rockBandGuitar.performSound();
	}
}