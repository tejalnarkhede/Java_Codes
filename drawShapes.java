import java.applet.*;
import java.awt.*;
/*<applet code="drawShapes.class" height=400 width=400>

</applet>*/

public class drawShapes extends Applet

{

                //this is 4 drawpolygon

                int xs[]={40,49,60,70,57,40,35};

                int ys[]={260,310,315,280,260,270,265};

                //this is 4 fillpolygon

                int xss[]={140,150,180,200,170,150,140};

                int yss[]={260,310,315,280,260,270,265};

                public void paint(Graphics g)

                {

                                g.drawString("Some of the drawing objects ",40,20);

                                g.drawLine(40,30,200,30);//x1,y1-starting point,x2,y2-ending point coordinates

                                g.drawRect(40,60,70,40);//x1,y1-top left corner coordinates of the rectangle.

                                g.fillRect(140,60,70,40);//same as above

                                g.drawRoundRect(240,60,70,40,10,20);//int width1-width of angle of corners int height1=height of angle of corners

                                g.fillRoundRect(40,120,70,40,10,20);//same

                                g.draw3DRect(140,120,70,40,true);//same as drawRect() except 4 d last parameter  which takes true value to give raised rectangle and false value to gv lowered rectangle

                                g.drawOval(240,120,70,40);//x1,y1-coordinates of top corner, width of oval, height of oval

                                g.fillOval(40,180,70,40);//sm as above

                                g.drawArc(140,180,70,40,0,180);//angle1-degree value at which the arc starts, angle2-degree value at whch the arc ends

                                g.fillArc(40,180,70,40,0,-180);//sm as above

                                g.drawPolygon(xs,ys,7);//xs-an array of integers representing coordinates ,ys-an array of integers representing y coordinates,pts-an integer containing the total no of points

                                g.fillPolygon(xss,yss,7);

                }

}