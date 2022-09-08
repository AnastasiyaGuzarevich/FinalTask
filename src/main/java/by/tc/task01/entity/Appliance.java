package by.tc.task01.entity;

import java.util.Objects;

public class Appliance {

	private String applianceName;
	private double price;
	private int quantity;

	public Appliance() {
		applianceName = "";
		price = 0;
		quantity = 0;
	}

	public Appliance(String applianceName, double price, int quantity) {
		this.applianceName = applianceName;
		this.price = price;
		this.quantity = quantity;
	}

	public Appliance(String applianceName, double price) {
		this.applianceName = applianceName;
		this.price = price;
	}

	public String getApplianceName() {
		return applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Appliance [applianceName=" + applianceName + ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(applianceName, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return Objects.equals(applianceName, other.applianceName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}

}
