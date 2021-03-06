import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 15/06/2017.
 */
public class Clicker implements MouseHandler {


    Clickable c;
    private MouseEvent mouseEvent;

    Position position;
    private int mouseX;
    private int mouseY;

    public Clicker(Clickable clickable) {
        c = clickable;
        position = new Position();
        Mouse m = new Mouse(this);
        m.addEventListener(MouseEventType.MOUSE_CLICKED);


    }



    public void setC(Clickable clickable) {
        c = clickable;
    }


    public int getMouseX() {
        return mouseX;
    }
    public int getMouseY() {
        return mouseY;

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println(this.mouseX);
        System.out.println(this.mouseY);
        mouseX = (int) mouseEvent.getX();
        mouseY = (int) mouseEvent.getY();
        c.whenClick();

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    public MouseEvent getMouseEvent() {
        return this.mouseEvent;

    }

}
