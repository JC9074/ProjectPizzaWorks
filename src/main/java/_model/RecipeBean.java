package _model;

import java.io.Serializable;

public class RecipeBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer productId;
	private Integer materialsId;
	private double quantity;
	private String unit;
	
	public RecipeBean() {}
	
	public RecipeBean(Integer materialsId, double quantity, String unit) {
		this.materialsId = materialsId;
		this.quantity = quantity;
		this.unit = unit;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getMaterialsId() {
		return materialsId;
	}

	public void setMaterialsId(Integer materialsId) {
		this.materialsId = materialsId;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
