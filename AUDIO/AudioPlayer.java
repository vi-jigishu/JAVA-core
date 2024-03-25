
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

class AudioPlayer{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        Scanner scan= new Scanner(System.in);
        
        File file= new File("AudioSample.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        String response="";

        while(!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");

            response= scan.next().toUpperCase();
            
            switch (response) {
                case ("P"): clip.start();
                    break;
                case ("S"): clip.stop();
                    break;
                case ("R"): clip.setMicrosecondPosition(0);    //Resets clip to 0sec
                    break;
                case ("Q"): clip.close();
                    break;
                default: System.out.println("Not a valid response");
                    break;
            }
        }
        System.out.println("Byeee!");
        scan.close();
    }
} 