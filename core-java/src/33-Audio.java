//Program to implement audio logic

import static java.lang.System.out;
import static java.lang.System.in;
import java.io.File;
import javax.media.Player;
import javax.media.Manager;

class Audio
{
    static public void main(String...args)
    {
        // supportive formats: mpg, avl, wav
        Player play = Manager.createRealizedPlayer(new File("E:\Programming\TSI\Java\src\Sound.wav").toURI().toURL());
        play.start();
        Thread.sleep(5000);
        play.stop();
        out.println("HELLO");
    }
}