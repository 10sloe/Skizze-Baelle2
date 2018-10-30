import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{
    // Es soll drei Bälle geben
    Ball ball1;  
    Ball ball2;
    Ball ball3;   
    
    Skizze()
    {
        // Hier werden die drei Ballobjekte erzeugt
        ball1 = new Ball(100,100,2, Color.RED); 
        ball2 = new Ball(150,100,-2, Color.BLUE);
        ball3 = new Ball(200,100,0, Color.GREEN);
    }
 
    // Diese Methode wird immer und immer wieder ausgeführt
    void draw(GraphicsContext gc){
        gc.clearRect(0,0,400,400);
        
        // Die drei Bälle werden gezeichnet
        ball1.zeichnen(gc);
        ball2.zeichnen(gc);
        ball3.zeichnen(gc);
        
        // Die drei Bälle werden bewegt
        ball1.bewegen();
        ball2.bewegen();
        ball3.bewegen();
        
    }

}
