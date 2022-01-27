import packages.*;
import java.awt.*;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{
    public static int WIDTH = 480, HEIGHT = 480;
    public Game(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void tick(){

    }
    public void render(){

    }

    public static void main(String[] args) throws Exception {
        Game game = new Game();
        JFrame frame = new JFrame();

        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        new Thread(game).start();
    }

    @Override
    public void run() {
        while(true){
            tick();
            render();
            try {
                Thread.sleep(1000/60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
