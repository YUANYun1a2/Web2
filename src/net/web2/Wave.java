package net.web2;

import java.util.ArrayList;
import android.graphics.Bitmap;


public class Wave {

	Bitmap bitmap;
	ArrayList<Monstre> liste_monstre;
	
	public Wave(Bitmap bitmap) {
		this.bitmap = bitmap;
		liste_monstre = new ArrayList<Monstre>();
	}

}
