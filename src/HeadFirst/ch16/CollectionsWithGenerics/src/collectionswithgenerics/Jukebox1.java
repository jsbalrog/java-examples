package collectionswithgenerics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jenkinset
 */
public class Jukebox1 {

	ArrayList<Song> songList = new ArrayList<Song>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Jukebox1().go();
    }

	public void go() {
		getSongs();
		Collections.sort(songList);
		System.out.println(songList);
	}

	void getSongs() {
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while( (line = reader.readLine()) != null ) {
				addSong(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}

}
