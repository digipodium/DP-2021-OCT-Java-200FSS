import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class player {
    private JPanel mypanel;
    private JButton button1;
    private static final String TITLE = "My First Media Player";
    private static final String VIDEO_PATH = "D:\\Downloads\\sunset-beach.mp4";
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();


    public static void main(String[] args) {

        player pl = new player();

        pl.initialize();

        JFrame frame = new JFrame("player");
        frame.setContentPane(pl.mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        pl.loadVideo(VIDEO_PATH);

    }

    public void initialize(){
        mypanel.setLayout(new BorderLayout());
        mypanel.add(mediaPlayerComponent, BorderLayout.CENTER);

        JPanel controlsPane = new JPanel();
        button1 = new JButton("Play");
        controlsPane.add(button1);
        mypanel.add(controlsPane, BorderLayout.SOUTH);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.mediaPlayer().controls().play();
            }
        });
    }

    public void loadVideo(String path) {
        mediaPlayerComponent.mediaPlayer().media().start(path);
    }

}
