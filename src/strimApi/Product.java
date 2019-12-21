package strimApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

	private int productId;
	private String productNam;
	private double productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductNam() {
		return productNam;
	}
	public void setProductNam(String productNam) {
		this.productNam = productNam;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Product(int productId, String productNam, double productPrice) {
		super();
		this.productId = productId;
		this.productNam = productNam;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productNam=" + productNam + ", productPrice=" + productPrice
				+ "]";
	}

    
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(100,"mobile",2000));
		productList.add(new Product(101,"mobile",4000));
		productList.add(new Product(102,"mobile",6000));
		
		List<Double> d = productList.stream().filter(p -> p.productPrice >200).map(p -> p.getProductPrice()).collect(Collectors.toList());
		 System.out.println(d);
	}
}
