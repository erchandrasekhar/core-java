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
     
     System.out.println(searchPictureByColor(pictureList, "rgb"));
     
	}
	/*if u declare method is static than no need to create object of class were methods are defined we just go with class name.methodname to call*/
	public static ArrayList<Picture> searchPictureByColor(ArrayList<Picture> pictureList,String color)
	{   
		ArrayList<Picture> picList = new ArrayList<>();
		if(!pictureList.isEmpty())
		{
			for (Picture picture : pictureList)
			{
				if(picture!=null)
				{
					if(picture.getColor().equals(color))
					{
						picList.add(picture);
					}
					else
					{
						picList.add(null);
					}
				}
			}
		}
		return picList;
	}
}
