package DTO;

import java.io.Serializable;

public class InvoiceDTO implements Comparable<CustomerDTO> , Serializable{
	
	
	private int invoiceId , customerId;
	private String date;
	
	

	public InvoiceDTO(int invoiceId, int customerId, String date) {
		super();
		this.invoiceId = invoiceId;
		this.customerId = customerId;
		this.date = date;
	}



	public InvoiceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	public int getInvoiceId() {
		return invoiceId;
	}



	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	@Override
	public int compareTo(CustomerDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
