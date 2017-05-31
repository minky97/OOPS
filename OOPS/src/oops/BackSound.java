package oops;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineEvent.Type;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.*;

/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * 
 * @author www.codejava.net
 *
 */
public class BackSound implements LineListener {

	/**
	 * this flag indicates whether the playback completes or not.
	 */
	boolean playCompleted;
	private String music;
	private DataLine.Info info;
	private File audioFile;
	private AudioInputStream audioStream;
	private AudioFormat format;
	private Clip audioClip;

	/**
	 * Play a given audio file.
	 * 
	 * @param audioFilePath
	 *            Path of the audio file.
	 */
	public BackSound(String music) {
		this.music = music;
		info = new DataLine.Info(Clip.class, format);
	}

	void play(String audioFilePath, boolean check) {
		audioFile = new File(audioFilePath);

		try {
			audioStream = AudioSystem.getAudioInputStream(audioFile);

			format = audioStream.getFormat();

			audioClip = (Clip) AudioSystem.getLine(info);

			audioClip.addLineListener(this);

			audioClip.open(audioStream);
			if (check)
				audioClip.start(); // 노래 나오게 하는 것

			else {
				audioClip.stop(); // 노래 안 나오게 하는 것
				audioClip.close();
			}
			// while (!playCompleted) {
			// // wait for the playback completes
			// try {
			// Thread.sleep(5000);
			// } catch (InterruptedException ex) {
			// ex.printStackTrace();
			// }
			// }

		} catch (UnsupportedAudioFileException ex) {
			System.out.println("The specified audio file is not supported.");
			ex.printStackTrace();
		} catch (LineUnavailableException ex) {
			System.out.println("Audio line for playing back is unavailable.");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("Error playing the audio file.");
			ex.printStackTrace();
		}

	}

	/**
	 * Listens to the START and STOP events of the audio line.
	 */
	@Override
	public void update(LineEvent event) {
		LineEvent.Type type = event.getType();

		if (type == LineEvent.Type.START) {
			System.out.println("Playback started.");

		} else if (type == LineEvent.Type.STOP) {
			playCompleted = true;
			System.out.println("Playback completed.");
		}

	}

	public void mulist(boolean start) {

		String store = null;
		switch (music) {

		case "game1":
			store = "game1.wav";
			break;
		case "game2":
			store = "game2.wav";
			break;
		case "game3":
			store = "game3.wav";
			break;
		case "main":
			store = "main.wav";
			break;
		case "timesup":
			store = "timesup.wav";
			break;
		case "logout":
			store = "logout.wav";
			break;

		}
		if (store == null) {
			System.out.println("error!");
		}

		play(store, start);

	}

}

// http://www.codejava.net/coding/how-to-play-back-audio-in-java-with-examples