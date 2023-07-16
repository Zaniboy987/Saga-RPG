package Main;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class GameWindow {
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {
        // CREATE JFrame OBJECT
        jframe = new JFrame();

        // EXITS GAME WHEN WINDOW IS CLOSED
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.pack(); // create window to fit Jpanel to fit dim
        jframe.setVisible(true); // DETERMINING WHETHER SCREEN IS VISIBLE
        jframe.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {

            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                gamePanel.getGame().windowLost();
            }
        });
    }

}

