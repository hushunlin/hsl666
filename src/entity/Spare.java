package entity;

import java.sql.Date;

public class Spare {
	
	/**
	 * �豸��Ϣʵ����
	 */
	
	private int id;//���
	private String type;//�ͺ�
	private float factoryprice;//�۸�
	private Date dateproduction;//��������
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
