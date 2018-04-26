package japplet;
import javax.swing.JApplet; //zaimportowanie klasy JApplet 
import java.util.Timer;
import java.awt.*;

public class SpringApplet extends JApplet   { 
   
    int szer=600;
    int wys= 600;
    float polx;
    float poly;
	private SimEngine simengine;//stworzenie pola klasy SimEngine
	private SimTask simtask;//stworzenie pola klasy SimTask
	private Timer odstep;  //stworzenie pola klasy Timer
	
	
    @Override
    public void init(){ 
    setSize(szer,wys);
    simengine= new SimEngine(10,3,1,150,200,150,200,100);
    simtask  = new SimTask(simengine,this,0.1);
    odstep   = new Timer();
    odstep.scheduleAtFixedRate(simtask, 0, 15);
   

    }
 
    
    public void paint(Graphics g){ 
    Vector2D wychylenie = simengine.polozenie;
    g.setColor(Color.white);
    g.fillRect(0, 0, szer, wys); // czyszczenie ekranu
    g.setColor(Color.GRAY);
    
    g.fillRect(245, 84, 70, 15); // rysowanie utwierdzenia linki
    
    g.setColor(Color.BLUE); //rysowanie linki 
    g.drawLine((int)simengine.getpolozenieX()+80,100,(int)simengine.getpolozenieX()+80,(int)((int)(wychylenie.y)+simengine.getL0()));
   
    g.setColor(Color.RED);// rysowanie masy 
    g.fillOval((int)simengine.getpolozenieX()+55, (int)(simengine.getpolozenieY()+simengine.getL0()),50,50);
     }
	
	
	

    }



