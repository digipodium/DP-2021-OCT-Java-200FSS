import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyPlayer extends JFrame {
    private static final String TITLE = "Smart Video Player";
    private static final String VIDEO_PATH = "D:\\Videos\\The Lion King Official Trailer.mp4";
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;
    private JButton playButton;

    public MyPlayer(String title) {
        super(title);
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
    }


    public void initialize() {
        this.setBounds(100, 100, 800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mediaPlayerComponent.release();
                System.exit(0);
            }
        });
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(mediaPlayerComponent, BorderLayout.CENTER);

        JPanel controlsPane = new JPanel();
        playButton = new JButton("Play");
        controlsPane.add(playButton);
        contentPane.add(controlsPane, BorderLayout.SOUTH);
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.mediaPlayer().controls().play();
            }
        });
        this.setContentPane(contentPane);
        this.setVisible(true);
    }
    public void loadVideo(String path) {
        mediaPlayerComponent.mediaPlayer().media().start(path);
    }
    public static void main( String[] args ){

        MyPlayer application = new MyPlayer(TITLE);
        application.initialize();
        application.setVisible(true);
        application.loadVideo(VIDEO_PATH);
    }
}