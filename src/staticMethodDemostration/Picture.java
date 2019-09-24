package staticMethodDemostration;

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
	
	
}
