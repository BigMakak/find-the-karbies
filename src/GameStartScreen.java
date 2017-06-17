import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 15/06/2017.
 */
public class GameStartScreen implements Clickable {

    Clicker clicker;
    Picture startButton;
    Picture picture;

    public GameStartScreen() {
        clicker = new Clicker(this);
        startButton = new Picture(10, 10, "http://weclipart.com/gimg/882A0DDFB6952D67/start-button-clipart-1.jpg");
        picture = new Picture(50,50,"http://gecon.es/wp-content/uploads/2014/11/gameover.jpg");
        startButton.draw();
        this.whenClick();
    }

    @Override
    public void whenClick() {

        if (clicker.getMouseX() >= startButton.getX() &&
                clicker.getMouseX() <= startButton.getMaxX() &&
                clicker.getMouseY() >= startButton.getY() &&
                clicker.getMouseY() <= startButton.getMaxY()) {
            picture.draw();
            startButton.delete();
        }
    }
}
