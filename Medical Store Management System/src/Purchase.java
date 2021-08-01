import java.util.*;

public class Purchase {

	private int id;
	private Date date;
    private List<Medicine> purchaseItems = new ArrayList<Medicine>();
	private double totalAmount;
	private Customer customerDetails;
	
	Purchase(int id, Date date, List<Medicine> purchaseItems, double totalAmount, Customer customerDetails)
	{
		this.id = id;
		this.date = date;
		this.purchaseItems = purchaseItems;
		this.totalAmount = totalAmount;
		this.customerDetails = customerDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Medicine> getPurchaseItems() {
		return purchaseItems;
	}

	public void setPurchaseItems(List<Medicine> purchaseItems) {
		this.purchaseItems = purchaseItems;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Customer getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
	
	
}
