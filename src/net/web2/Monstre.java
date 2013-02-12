package net.web2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

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
	

	public Monstre(Bitmap bitmap, float position, Wave wave, Chemin chemin){
		this.bitmap = bitmap;
		this.position = position;
		this.wave = wave;
		this.chemin = chemin;
		paint = new Paint();
	}
	
	private void move(){
		position = position + 1; // ou ++position
	}
	
	public void draw(Canvas canvas) {
		canvas.drawBitmap(bitmap, x, y, paint);
	}

	public float getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getX() {
		// TODO Auto-generated method stub
		return 0;
	}
}
