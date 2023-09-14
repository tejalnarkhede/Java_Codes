import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AverageApplet extends Applet implements ActionListener {

	int v1,v2,v3,avg;
	TextField t1=new TextField(5);
	Label l1=new Label("Value 1:");
	TextField t2=new TextField(5);
	Label l2=new Label("Value 2:");
	TextField t3=new TextField(5);
	Label l3=new Label("Value 3");
	Button b1=new Button("Find Average");
	Button b2=new Button("Reset");
	
	public void init() {
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void paint(Graphics g) {
		
		g.drawString("Average = "+avg, 600, 100);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
		v1=Integer.parseInt(t1.getText());
		v2=Integer.parseInt(t2.getText());
		v3=Integer.parseInt(t3.getText());
		avg=(v1+v2+v3)/3;
		repaint();
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			avg=0;
			repaint();
		}
		
	}
	
	
}
