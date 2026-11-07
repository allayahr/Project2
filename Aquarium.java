import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {
public static void main(String[] args) {
CanvasAPI canvas = Graphics.createCanvas(800, 600, "My Aquarium");

 PainterAPI painter = canvas.getPainter();
 painter.setSpeed(0); // Lower number means faster, zero means as fast as possible.
 drawBackround(painter);
 
}
public static void drawBackround(PainterAPI painter) { 
    painter.liftPen();
    
    //Move from center toward top-left
    painter.backward(400);
    painter.turnLeft(90);
    painter.forward(300);
    painter.turnRight(90);
    
    painter.lowerPen();
    painter.setPenColor(Color.BLUE);
    painter.setPenWidth(6);

    //Draw Blue Backround
    for (int i = 0; i < 100; i++) {
        painter.forward(800);
        painter.turnRight(180);
        painter.forward(800);
        painter.turnLeft(90);
        painter.forward(6);
        painter.turnLeft(90);
        
    }    



}
public static void drawsand(PainterAPI painter) {
}
public static void drawStarfish(PainterAPI painter){
}
public static void drawSeaweed(PainterAPI painter){
}
public static void drawBubbles(PainterAPI painter){
}
} 





 