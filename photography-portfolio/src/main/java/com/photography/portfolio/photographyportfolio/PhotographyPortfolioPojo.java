package com.photography.portfolio.photographyportfolio;

//@Document("photography")
public class PhotographyPortfolioPojo {
//	@Id
	String Id;
	String image;
	String shootType;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getShootType() {
		return shootType;
	}
	public void setShootType(String shootType) {
		this.shootType = shootType;
	}
	public PhotographyPortfolioPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhotographyPortfolioPojo(String id, String image, String shootType) {
		super();
		Id = id;
		this.image = image;
		this.shootType = shootType;
	}
}
