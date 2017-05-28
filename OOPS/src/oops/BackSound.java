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
 
/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * @author www.codejava.net
 *
 */
public class BackSound implements LineListener {
     
    /**
     * this flag indicates whether the playback completes or not.
     */
    boolean playCompleted;
    private String music;
    /**
     * Play a given audio file.
     * @param audioFilePath Path of the audio file.
     */
    public BackSound(String music){
    	this.music = music;
    }
    void play(String audioFilePath,boolean start) {
        File audioFile = new File(audioFilePath);
 
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = (Clip) AudioSystem.getLine(info);
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
             if(start)
            audioClip.start(); // 노래 나오게 하는 것
            
             else if(!start)
            audioClip.stop(); //노래 안 나오게 하는 것
             
            while (!playCompleted) {
                // wait for the playback completes
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
            audioClip.close();
             
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
    	
    	BackSound player = new BackSound(music);
    	
 
    	if(music.equals("game1")){
    	String game1 = "game1.wav";
        player.play(game1,start);
    	}
    	else if(music.equals("game2")){
        String game2 = "game2.wav";
        player.play(game2,start);
    	}
    	else if(music.equals("game3")){
        String game3 = "game3.wav";
        player.play(game3,start);
    	}
    	else if(music.equals("logout")){
        String logout = "C:logout.wav";
        player.play(logout,start);
    	}
    	else if(music.equals("main")){
        String main = "C:main.wav";
        player.play(main,start);
    	}
    	else if(music.equals("timesup")){
        String timesup = "C:timesup.wav";
        player.play(timesup,start);
    	}
    	
    }
    
//    public static void main(String[] args) {
//    	
//    	BackSound bc = new BackSound();
//    	bc.mulist();
//    	
//    }
 
}

//http://www.codejava.net/coding/how-to-play-back-audio-in-java-with-examples