package staticMethodDemostration;

import java.util.ArrayList;

public class Picture {

	private int  pictureId;
	private String  color;
	private double  area;
	public int getPictureId() {
		return pictureId;
	}
	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Picture(int pictureId, String color, double area) {
		super();
		this.pictureId = pictureId;
		this.color = color;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Picture [pictureId=" + pictureId + ", color=" + color + ", area=" + area + "]";
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
					
				}
			}
		}
		return picList;
	}
	
	
}
