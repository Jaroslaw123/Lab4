package japplet;

public class Vector2D {   //utworzenie klasy Vector2D

	  public float x; //publiczne pole wspó³rzêdnej x
	  public float y; //publiczne pole wspó³rzêdnej y
	  public Vector2D(){ //konstruktor domyœlny
	    this.x=0;
	    this.y=0;
	    }
	  public Vector2D(float X,float Y){ //konstruktor z parametrami
	      this.x=X;
	      this.y=Y;
	  }
	public Vector2D Suma(Vector2D v) // metode zwracaj¹ca sumê dwóch wektorów
	{
	        Vector2D vektor = new Vector2D(this.x + v.x, this.y+v.y);
	        return vektor;
	    }
	public Vector2D Roznica(Vector2D v)//metoda zwracaj¹ca ró¿nicê dwóch wektorów
	    {
	       Vector2D vektor = new Vector2D(this.x -v.x, this.y-v.y);
	       return vektor;
	    }
	public Vector2D Iloczyn(float m){ //metoda zwracaj¹ca lioczyn wektora i pewnej sta³ej 
	    Vector2D vektor = new Vector2D(this.x*m, this.y*m);
	               return vektor;
	}
	public float modul() // metoda obliczaj¹ca d³ugoœæ wektora 
	{
	        return (float) Math.sqrt(this.x*this.x+this.y*this.y);
	}
	public Vector2D znormalizowany(){ // metoda normalizuj¹ca wektor 
	    Vector2D vektor = new Vector2D(this.x/modul(),this.y/modul());
	    return vektor;
	}
	}
