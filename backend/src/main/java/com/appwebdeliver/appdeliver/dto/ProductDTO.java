package com.appwebdeliver.appdeliver.dto;

import java.io.Serializable;

import com.appwebdeliver.appdeliver.entities.Produtos;

public class ProductDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private Double price;
	private String description;
	private String ImageUri;
	
	public ProductDTO() {
		
	}

	public ProductDTO(long id, String name, Double price, String description, String imageUri) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		ImageUri = imageUri;
	}
	
	public ProductDTO(Produtos entity) {
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		description = entity.getDescription();
		ImageUri = entity.getImageUri();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return ImageUri;
	}

	public void setImageUri(String imageUri) {
		ImageUri = imageUri;
	}
	
	
}
