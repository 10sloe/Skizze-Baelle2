import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Ball
{
    // Attribute
    double x;
    double y;
    double v;
    Color farbe;
    
    // Konstruktor    
    Ball(double x_, double y_, double v_, Color farbe_)
    {
        x = x_;
        y = y_;
        v = v_;
        farbe = farbe_;
    }
     
    void bewegen()
    {
        v = v + 0.1;     
        y = y + v; 
        
        if(y > 400)  
        {
            v = -v;
        }
    }
    
    void zeichnen(GraphicsContext gc)
    {
        gc.setFill(farbe);  
        gc.fillOval(x,y,20,20); 
    }
    
}
