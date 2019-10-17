package com.my.vo;

import java.sql.Date;

public class Card {

	private int id;
	private int cardNo;
	private String departName;
	private Date birthplace;

	public Card() {
		super();
	}

	public Card(int id, int cardNo, String departName, Date birthplace) {
		super();
		this.id = id;
		this.cardNo = cardNo;
		this.departName = departName;
		this.birthplace = birthplace;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public Date getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(Date birthplace) {
		this.birthplace = birthplace;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", cardNo=" + cardNo + ", departName=" + departName + ", birthplace=" + birthplace
				+ "]";
	}

}
