import packages.*;
import java.awt.*;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{
    public static int WIDTH = 480, HEIGHT = 480;
    public Game(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public static void main(String[] args) throws Exception {
        Game game = new Game();
        JFrame frame = new JFrame();

        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
}