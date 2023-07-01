import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Ball1 extends Applet implements Runnable,ActionListener{
	int x;
	Button b1,b2,b3,b4;
	Thread t;
	@Override
	public void init(){
		setBackground(Color.cyan);
		b1=new Button("Life");
		b2=new Button("kill");
		b3=new Button("Pause");
		b4=new Button("Resume");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
		}
		@Override
		public void run(){
			while(true){
				for(x=1;x<=getSize().width; x+=20){
			repaint();
			try{
			Thread.sleep(200);
			}catch(InterruptedException ie){
				}
			}
		}
	}
		@Override
		public void paint(Graphics g){
			g.setColor(Color.black);
			g.fillOver(x,200,50,50);
			}
		@Override
		public void
		actionPerformed(ActionEvent ae){
			Button bb = (Button)
			ae.getSource();
			if((bb == b1)&&(t == null)){
			t=new Thread(this);
			t.start();
			}
		else if((bb == b2)&&(t!=null)){
		t.stop();
		t=null;
		else if((bb == b3)&&(t!=null)){
		t.suspend();
		}
		else if((bb == b4)&&(t!=null)){
		t.resume();
			}
		}
	}
} 
/*<applet code="Ball1" width = 400 height=400>
</applet>*/	

