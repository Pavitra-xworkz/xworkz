package com.xworkz.DTO;

public class MobileDTO {
	private String modelName;
	private byte ram;
	private int price;
	private short Storage;
	private String size;
	private int batteryBackup;
	private String cameraPixel;
	private String color;

	public MobileDTO() {
		System.out.println("created MobileDTO");
	}

	public MobileDTO(String modelName, String color, String cameraPixel, int price, int battryBackup) {
		System.out.println("1st DTO Constructor");
		this.modelName = modelName;
		this.color = color;
		this.cameraPixel = cameraPixel;
		this.price = price;
		this.batteryBackup = batteryBackup;

	}

	public MobileDTO(byte Storage, String size) {
		System.out.println("2nd DTO Constructor");
		this.Storage = Storage;
		this.size = size;

	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBatteryBackup() {
		return batteryBackup;
	}

	public void setBatteryBackup(int batteryBackup) {
		this.batteryBackup = batteryBackup;
	}

	public byte getRam() {
		return ram;
	}

	public void setRam(byte ram) {
		this.ram = ram;
	}

	public byte getStorage() {
		return (byte) Storage;
	}

	public void setStorage(byte storage) {
		Storage = storage;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	public String getCameraPixel() {
		return cameraPixel;
	}

	public void setCameraPixel(String cameraPixel) {
		this.cameraPixel = cameraPixel;
	}

}
