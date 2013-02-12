package net.web2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Monstre {
	
	Chemin chemin;
	Bitmap bitmap;
	float dDD; // distance Depuis Début
	float vx=1; // vitesse
	float position;
	TileView grille;
	Paint paint;
	Wave wave;
	float x;
	float y;
	
	public Monstre(Bitmap bitmap, float x, float y, Wave wave){
		this.bitmap = bitmap;
		this.x = x;
		this.y = y;
		this.wave = wave;
		paint = new Paint();
	}
	
	private int getXposition(){
		x = chemin.getX(position);
		return (int) x;
	}
	
	private int getYposition(){
		y = chemin.getY(position);
		return (int) y;
	}
	
	float getXInterpolation(float position){
		  int i = (int) position; //indice de la case que l'on quitte
		  float x1 = getX(i); //abscisse de la case que l'on quitte
		  float x2 = getX(i+1); //abscisse de la case où l'on arrive
		  float c  = position-i; //fraction du trajet parcouru entre les deux cases
		  return x2*c + x1*(1-c); //combinaison des  abscisses.
		}
	
	private void move(){
		position = position + 1; // ou ++position
	}
	
	public void draw(Canvas canvas) {
		canvas.drawBitmap(bitmap, x, y, paint);
	}
}
