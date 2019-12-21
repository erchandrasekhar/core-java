package staticMethodDemostration;

import java.util.ArrayList;

public class PictureDemo {

	public static void main(String[] args) {
		
     Picture picture1 = new Picture(100, "rgb", 20);
     Picture picture2 = new Picture(101, "rgb", 10);
     Picture picture3 = new Picture(100, "tbg", 30);
     Picture picture4 = new Picture(100, "kfc", 50);
     Picture picture5 = new Picture(100, "ck", 40);
     
     ArrayList<Picture> pictureList = new ArrayList<>();
     pictureList.add(picture1);
     pictureList.add(picture2);
     pictureList.add(picture3);
     pictureList.add(picture4);
     pictureList.add(picture5);
     
     System.out.println(Picture.searchPictureByColor(pictureList, "rgb"));
     
	}
	
}
