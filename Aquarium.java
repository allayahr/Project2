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
 drawsand(painter);
 drawStarfish(painter);
 drawSeaweed(painter);

 
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
    painter.liftPen();

    //Move from bottom left up to the top
    painter.turnLeft(90);
    painter.forward(90);
    painter.turnRight(90);

    painter.setPenColor(new Color(237,201,175));
    painter.setPenWidth(6);
    painter.lowerPen();

    //Draw  sand across the bottom
    for (int i = 0; i < 15; i++) {
        painter.forward(800);
        painter.turnRight(180);
        painter.forward(800);
        painter.turnLeft(90);
        painter.forward(6);
        painter.turnLeft(90);
    }
    
    painter.liftPen();
}
public static void drawStarfish(PainterAPI painter){
    painter.liftPen();

    //Move to the first starfish
    painter.forward(160);
    painter.turnLeft(90);
    painter.forward(45);

    painter.setPenColor(Color.ORANGE);
    painter.setPenWidth(12);
    painter.lowerPen();

    //Draw five arms
    for (int i = 0; i < 5; i++) {
        painter.forward(32);
        painter.backward(32);
        painter.turnRight(72);
    }
    painter.liftPen();
    
    //Move to the second starfish
    painter.turnRight(90);
    painter.forward(430);
    painter.turnLeft(90);

    painter.setPenColor(Color.PINK);
    painter.lowerPen();

    for (int i = 0; i < 5; i++) {
        painter.forward(28);
        painter.backward(28);
        painter.turnRight(72);




    }
    painter.liftPen();
    painter.turnRight(90);    
}
public static void drawSeaweed(PainterAPI painter){
    painter.liftPen();

    //Move from the second starfish to to the left 
    painter.backward(520);
    painter.turnLeft(90);
    painter.forward(30);
    painter.turnRight(90);

    painter.setPenColor(new Color(34,139,34));
    painter.setPenWidth(6);

    //Draw three stems
    for (int stem =0; stem < 3; stem++) {
        painter.turnLeft(90);
        painter.lowerPen();

        //Draw the stem and leaves
        for (int leaf = 0; leaf < 5; leaf++) {
            painter.forward(20);

            painter.turnRight(45);
            painter.forward(15);
            painter.backward(15);

            painter.turnLeft(90);
            painter.forward(15);
            painter.backward(15);

            painter.turnRight(45);
        }    

            //Return to the bottom and move over
            painter.liftPen();
            painter.backward(100);
            painter.turnRight(90);
            painter.forward(35);
    }      

}
public static void drawBubbles(PainterAPI painter){
}
} 





 