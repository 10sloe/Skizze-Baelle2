import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ball
{
    // Attribute
    double x;
    double y;
    double v;
    double a = 0.1;
    Color farbe;
    
    // Konstruktor
    public Ball(double x_, double y_, double v_, Color farbe_)
    {
        x = x_;
        y = y_;
        v = v_;
        farbe = farbe_;
    }
    
    public void zeichnen(GraphicsContext gc)
    {
        gc.setFill(farbe);    // Ball1 zeichnen
        gc.fillOval(x,y,20,20); 
    }
    
    public void bewegen()
    {
        v = v + a;     // Ball1 bewegen
        y = y + v; 
        
        if(y > 400)  // Ball1 wird am unteren Rand reflektiert
        {
            v = -v;
        }
    }
    
}
