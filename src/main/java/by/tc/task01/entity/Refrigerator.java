package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {

	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private double overallCapacity;
	private int height;
	private int width;

	public Refrigerator() {

		super();

	}

	public Refrigerator(String applianceName, double price, int quantity, int powerConsumption, int weight,
			int freezerCapacity, double overallCapacity, int height, int width) {

		super(applianceName, price, quantity);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;

	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(freezerCapacity, height, overallCapacity, powerConsumption, weight, width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		return freezerCapacity == other.freezerCapacity && height == other.height
				&& Double.doubleToLongBits(overallCapacity) == Double.doubleToLongBits(other.overallCapacity)
				&& powerConsumption == other.powerConsumption && weight == other.weight && width == other.width;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption = " + powerConsumption + ", weight = " + weight + ", freezerCapacity = "
				+ freezerCapacity + ", overallCapacity = " + overallCapacity + ", height = " + height + ", width = " + width
				+ "]";
	}

	

}
