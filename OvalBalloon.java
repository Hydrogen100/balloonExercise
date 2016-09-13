import java.awt.Color;
import java.awt.Graphics;
public class OvalBalloon extends Balloon{
public OvalBalloon(){

}

public OvalBalloon(int x, int y, int r, Color c){
super(x,y,r,c);
}

public double distance(int x, int y)
  {
    double dx = 2*(x - super.getX());
    double dy = y - super.getY();
    return Math.sqrt(dx*dx + dy*dy);
  }

 public void draw(Graphics g, boolean makeItFilled)
  {
    g.setColor(super.getColor());
    if (makeItFilled)
      g.fillOval(super.getX() - super.getRadius(),
                 super.getY() - super.getRadius(), super.getRadius(), 2*super.getRadius());
    else
      g.drawOval(super.getX() - super.getRadius(),
                 super.getY() - super.getRadius(), super.getRadius(), 2*super.getRadius());
}

}