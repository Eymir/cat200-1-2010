package RestOrdSystem.Administrator;

import java.sql.Date;

public class ReceiptModel {
	
	private int receiptNumber;
	private Date receiptDate;
	private int tableNumber;
	private double priceCharged;
	
	
	public int getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(int receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public Date getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public double getPriceCharged() {
		return priceCharged;
	}
	public void setPriceCharged(double priceCharged) {
		this.priceCharged = priceCharged;
	}
	
	
	

}
