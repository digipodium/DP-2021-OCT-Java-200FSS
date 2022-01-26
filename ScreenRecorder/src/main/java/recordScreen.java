import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.api.SequenceEncoder;

public class recordScreen {

    public static void main(String[] args) throws AWTException, IOException {
        List<BufferedImage> imageList = new ArrayList<>();

        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        Robot robot = new Robot();

        File file = new File("myrecording.mp4");

        for(int i=0;i<200;i++){
            BufferedImage image = robot.createScreenCapture(screenRect);
            imageList.add(image);
        }


    }

    public static void imagesToVideo(List<BufferedImage> imageList, File file){
        SequenceEncoder seqEncoder = SequenceEncoder.createSequenceEncoder(file, );

        for( BufferedImage image : imageList ){
            seqEncoder.encodeImage(image);
        }

        seqEncoder.finish();
    }
}
