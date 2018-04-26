package japplet;

import java.util.TimerTask; //zaimportowanie klasy TimerTask


public class SimTask extends TimerTask { // utworzenie klasy pochodnej do TimerTask

    private SimEngine simEngine;  //pole przechowywujace obiekt klasy SimEngine 
    private SpringApplet springApplet;// pole przechowywujace obiekt klasy Spring Applet
    private double odstep; // prywatne pole do przechowywania obiektu 
    public SimTask (SimEngine simEngine,SpringApplet springApplet,double odstep ){
    this.simEngine=simEngine;        //konstruktor pozwalaj¹cy na przypisanie 
    this.springApplet=springApplet;  // do pól obiektu klasy simEngine
    this.odstep=odstep;
    }
    
    public void run(){ //wywo³anie metody run
    	simEngine.Simulate(odstep);
    	springApplet.repaint();
    	}
        }

