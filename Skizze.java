import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{
    // Es soll drei Bälle geben
    Ball ball1 = new Ball(100, 150, 2, Color.RED);
    Ball ball2 = new Ball(150, 100, 1, Color.BLUE);
    Ball ball3 = new Ball(200, 100,-2, Color.GREEN);  
    
    // Diese Methode wird immer und immer wieder ausgeführt
    void draw(GraphicsContext gc){
   
        // Die drei Bälle werden bewegt
        ball1.bewegen();
        ball2.bewegen();
        ball3.bewegen();
             
        // Die drei Bälle werden gezeichnet
        gc.clearRect(0,0,400,400);
        ball1.zeichnen(gc);
        ball2.zeichnen(gc);
        ball3.zeichnen(gc);
        
    }

}
