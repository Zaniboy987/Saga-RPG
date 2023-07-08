package Main;

import javax.swing.*;

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

        // create window to fit Jpanel to fit dim
        jframe.pack();

        // DETERMINING WHETHER SCREEN IS VISIBLE
        jframe.setVisible(true);
    }

}

