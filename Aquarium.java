import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {
public static void main(String[] args) {
CanvasAPI canvas = Graphics.createCanvas(800, 600, "My Aquarium");

 PainterAPI painter = canvas.getPainter();
 painter.setSpeed(10); // Lower number means faster, zero means as fast as possible.
 painter.forward(100);
}
public static void drawBackround(PainterAPI painter) {
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





 