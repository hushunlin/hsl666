package entity;

import java.sql.Date;

public class Spare {
	
	/**
	 * 设备信息实体类
	 */
	
	private int id;//编号
	private String type;//型号
	private float factoryprice;//价格
	private Date dateproduction;//出厂日期
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getFactoryprice() {
		return factoryprice;
	}
	public void setFactoryprice(float factoryprice) {
		this.factoryprice = factoryprice;
	}
	public Date getDateproduction() {
		return dateproduction;
	}
	public void setDateproduction(Date dateproduction) {
		this.dateproduction = dateproduction;
	}
}
