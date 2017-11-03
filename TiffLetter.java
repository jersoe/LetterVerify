package com.jersoe.letterverify;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TiffLetter {
	BufferedImage _image;
	
	public TiffLetter(String fileName){
		File file = new File(fileName);
		try {
			_image=ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public int getWidth() {
	return _image.getWidth();
}

public int getHeight() {
	return _image.getHeight();
}

public boolean isAreaBlank(int x1, int y1, int x2, int y2) {
	 for (int y=y1; y<y2; y++) {
		 for (int x=x1; x<x2; x++) {
			 if (_image.getRGB(x, y)<-1.1 ) {
				 return false;
			 }
		 } 
	 }
	return true;
}
	
	
