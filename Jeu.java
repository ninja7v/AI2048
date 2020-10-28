import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Jeu{
	public static Jeu2048 j ;
public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	j = new Jeu2048();
            j.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    Simulateur s = new Simulateur();
                    s.tilesAct = j.tiles.clone();
                    EvaCoin eva = new EvaCoin(j.tiles); 
                    s.meilleurCoup3(eva, j);
                    j.repaint();
                }
            });
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("2048");
            f.setResizable(true);
            f.add(j, BorderLayout.CENTER);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }
}
