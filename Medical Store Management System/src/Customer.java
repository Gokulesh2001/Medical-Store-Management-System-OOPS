import java.util.*;

public class Customer {

	private int id;
	private String name;
	private long mobileNumber;
	private List<Medicine> medicineList = new ArrayList<Medicine>();
	private String address;
	private String emailId;
	
	
	Customer(int id, String name, long mobileNumber, String address, String emailId)
	{
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.emailId = emailId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public List<Medicine> getMedicineList() {
		return medicineList;
	}


	public void setMedicineList(List<Medicine> medicineList) {
		this.medicineList = medicineList;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
