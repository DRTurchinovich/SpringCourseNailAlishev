import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Computer {
    @Autowired
    public Computer(MusicPlayer musicPlayer) {
    }


    public String toString()    {
        return "Computer" + id + " " + music.getSong();
    }
}
