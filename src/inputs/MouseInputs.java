package inputs;

import Main.GamePanel;
import gamestates.Gamestate;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {

    private GamePanel gamePanel;

    public MouseInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void mouseClicked(MouseEvent e) {
        switch (Gamestate.state) {
            case PLAYING:
                gamePanel.getGame().getMenu().mouseClicked(e);
                break;
            case MENU:
                gamePanel.getGame().getPlaying().mouseClicked(e);
                break;
            default:
                break;
        }
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {

    }
}