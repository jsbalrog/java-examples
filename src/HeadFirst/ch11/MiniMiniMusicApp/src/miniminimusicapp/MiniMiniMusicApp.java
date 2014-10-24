package miniminimusicapp;

import javax.sound.midi.*;
/**
 *
 * @author jenkinset
 */
public class MiniMiniMusicApp {

	public static void main(String[] args) {
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
	}

	public void play() {
		try {
			// Get a Sequencer and open it
			Sequencer player = MidiSystem.getSequencer();
			player.open();

			Sequence seq = new Sequence(Sequence.PPQ, 4);

			// Ask the Sequence for a Track.
			Track track = seq.createTrack();

			// Put some MidiEvents into the Track.
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);

			ShortMessage b= new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);

			player.setSequence(seq);

			player.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}