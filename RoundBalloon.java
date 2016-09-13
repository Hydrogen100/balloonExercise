/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon
{
 

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public RoundBalloon()
  {
   super();
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public RoundBalloon(int x, int y, int r, Color c)
  {
    super(x,y,r,c);
  }

  
  public void draw(Graphics g, boolean makeItFilled)
  {
    g.setColor(super.getColor());
    if (makeItFilled)
      g.fillOval(super.getX() - super.getRadius(),
                 super.getY() - super.getRadius(), 2*super.getRadius(), 2*super.getRadius());
    else
      g.drawOval(super.getX() - super.getRadius(),
                 super.getY() - super.getRadius(), 2*super.getRadius(), 2*super.getRadius());
  }
}
