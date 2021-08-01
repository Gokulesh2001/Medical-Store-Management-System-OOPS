
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MedicalStoreManagement {

	
	static Scanner sc = new Scanner(System.in);
	
	
	ArrayList<Medicine> medicineList = new ArrayList<Medicine>();
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();
	
	void getDetails()
	{
		System.out.println("---------------------Medical Store Management System---------------------");
		System.out.println("1.Medicine Management");
		System.out.println("2.Customer Management");
		System.out.println("3.Purchase Management");
		System.out.println("4.Sales Report");
		System.out.println("5.Print Bill");
		System.out.println("6.Exit");
		System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				medicineManagement();
				getDetails();
				break;
			}
			case 2:
			{
				customerManagement();
				getDetails();
				break;
			}
			case 3:
			{
				purchaseManagement();
				getDetails();
				break;
			}
			case 4:
			{
				salesReport();
				getDetails();
				break;
			}
			case 5:
			{
				printBill();
				getDetails();
				break;
			}
			case 6:
			{
				 getDetails();
				 break;
			}
			default:
			{
				System.out.println("Please enter valid choice !");
				getDetails();
				break;
			}
		}
	}
	
	//Medicine Management
	void medicineManagement()
	{
		System.out.println("---------------------Medicine Management---------------------");
		System.out.println("1.Add medicine");
		System.out.println("2.Search medicine");
		System.out.println("3.View All medicines");
		System.out.println("4.Exit");
		System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		 case 1:
		 {
			 addMedicine();
			 medicineManagement();
			 break;
		 }
		 case 2:
		 {
			 searchMedicine();
			 medicineManagement();
			 break;
		 }
		 case 3:
		 {
			 viewAllMedicines();
			 medicineManagement();
			 break;
		 }
		 case 4:
		 {
			 getDetails();
			 break;
		 }
		 default:
		 {
			    System.out.println("Please enter valid choice !");
				medicineManagement();
				break;
		 }
		}
	}
	
	
	//Customer Management
	void customerManagement()
	{
		System.out.println("---------------------Customer Management---------------------");
		System.out.println("1.Add new customer");
		System.out.println("2.Update customer");
		System.out.println("3.Search customer");
		System.out.println("4.View all existing customers");
		System.out.println("5.Exit");
		System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		 case 1:
		 {
			 addNewCustomer();
			 customerManagement();
			 break;
		 }
		 case 2:
		 {
			 updateCustomer();
			 customerManagement();
			 break;
		 }
		 case 3:
		 {
			 searchCustomer();
			 customerManagement();
			 break;
		 }
		 case 4:
		 {
			 viewAllExistingCustomers();
			 customerManagement();
			 break;
		 }
		 case 5:
		 {
			 getDetails();
			 break;
		 }
		 default:
		 {
			    System.out.println("Please enter valid choice !");
				customerManagement();
				break;
		 }
		}
	}
	
	//Purchase Management
	void purchaseManagement()
	{
		System.out.println("---------------------Customer Management---------------------");
		System.out.println("1.Add new purchase");
		System.out.println("2.View all purchase");
		System.out.println("3.Exit");
		System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		 case 1:
		 {
			 addNewPurchase();
			 purchaseManagement();
			 break;
		 }
		 case 2:
		 {
			 viewAllPurchase();
			 purchaseManagement();
			 break;
		 }
		 case 3:
		 {
			 getDetails();
			 purchaseManagement();
			 break;
		 }
		 default:
		 {
			    System.out.println("Please enter valid choice !");
				purchaseManagement();
				break;
		 }
		}
	}
	
	//Sales Report
	void salesReport()
	{
		System.out.println("1.Which customer bought lot of medicine?");
		System.out.println("2.Which medicine sold the most?");
		System.out.println("3.Particular Day Sales");
		System.out.println("4.Exit");

		int choice = sc.nextInt();
		switch(choice)
		{
		 case 1:
		 {
			 customerWithLotOfMedicines();
			 salesReport();
			 break;
		 }
		 case 2:
		 {
			 mostSoldMedicine();
			 salesReport();
			 break;
		 }
		 case 3:
		 {
			 particularDaySales();
			 getDetails();
			 break;
		 }
		 case 4:
		 {
			 getDetails();
			 break;
		 }
		 default:
		 {
			    System.out.println("Please enter valid choice !");
			    salesReport();
				break;
		 }
		}
	}
	
	
	void customerWithLotOfMedicines()
	{
		int max = 0;
		
		for(Customer cus:customerList)
		{
			if(cus.getMedicineList().size() > max)
			{
				max = cus.getMedicineList().size();
			}
		}
		System.out.println("The customers who bought lot of medicines are");
		for(Customer cus:customerList)
		{
			if(cus.getMedicineList().size() == max)
			{
				System.out.println("Customer ID                 : "+cus.getId());
				System.out.println("Customer Name               : "+cus.getName());
				System.out.println("Customer Mobile Number      : "+cus.getMobileNumber());
				System.out.println("Customer Address            : "+cus.getAddress());
				System.out.println("Customer Email Id           : "+cus.getEmailId());
			}
		}
		
	
	}
	
	void mostSoldMedicine()
	{
        int min = Integer.MAX_VALUE;
		
		for(Medicine med:medicineList)
		{
			if(med.getQuantity() < min)
			{
				min = med.getQuantity();
			}
		}
		System.out.println("The medicine which sold the most are");
		
		for(Medicine med:medicineList)
		{
			if(med.getQuantity() == min)
			{
				System.out.println("Medicine ID        : "+med.getId());
				System.out.println("Medicine Name      : "+med.getName());
				System.out.println("Medicine Type      : "+med.getType());
				System.out.println("Medicine Price     : "+med.getPrice());
				System.out.println("Medicine Quantity  : "+med.getQuantity());
			}
		}
		
		
	}
	
	@SuppressWarnings("deprecation")
	void particularDaySales()
	{
		System.out.println("Enter the day:");
		int day = sc.nextInt();
		
		for(Purchase purchase:purchaseList)
		{
			if(purchase.getDate().getDay() == day)
			{
				
			
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Purchase ID :"+purchase.getId());
			System.out.println("Date(DD:MM:YYYY) :"+purchase.getDate().getDay()+":"+purchase.getDate().getMonth()+":"+purchase.getDate().getYear());
			List<Medicine> listOfMedicines = purchase.getPurchaseItems();
			System.out.println("ID        Name         Type        Price        Quanity");
			for(Medicine med:listOfMedicines)
			{
				System.out.println(med.getId()+"          "+med.getName()+"          "+med.getType()+"          "+med.getPrice()+"         "+med.getQuantity());
			}
			System.out.println("Total Amount :"+purchase.getTotalAmount());
			
			System.out.println("ID        Name         Mobile Number        Address        Email Id");
			System.out.println(purchase.getCustomerDetails().getId()+"          "+purchase.getCustomerDetails().getName()+"                  "+purchase.getCustomerDetails().getMobileNumber()+"          "+purchase.getCustomerDetails().getAddress()+"         "+purchase.getCustomerDetails().getEmailId());

			}
		}
	}
	@SuppressWarnings("deprecation")
	//Print Bill
	void printBill()
	{
		System.out.println("---------------------Print Bill---------------------");
		System.out.println("Enter Purchase Id :");
		
		int purchaseId = sc.nextInt();
		
		Purchase purchase = searchPurchaseById(purchaseId);
		
		if(purchase == null)
		{
			System.out.println("Sorry,Purchase Not Available");
			printBill();
			return;
		}
		else {
			
			System.out.println("Purchase ID :"+purchase.getId());
			System.out.println("Date(DD:MM:YYYY) :"+purchase.getDate().getDay()+":"+purchase.getDate().getMonth()+":"+purchase.getDate().getYear());
			List<Medicine> listOfMedicines = purchase.getPurchaseItems();
			System.out.println("ID        Name         Type        Price        Quanity");
			for(Medicine med:listOfMedicines)
			{
				System.out.println(med.getId()+"          "+med.getName()+"          "+med.getType()+"          "+med.getPrice()+"         "+med.getQuantity());
			}
			System.out.println("Total Amount :"+purchase.getTotalAmount());
			
			System.out.println("ID        Name         Mobile Number        Address        Email Id");
			System.out.println(purchase.getCustomerDetails().getId()+"          "+purchase.getCustomerDetails().getName()+"                  "+purchase.getCustomerDetails().getMobileNumber()+"          "+purchase.getCustomerDetails().getAddress()+"         "+purchase.getCustomerDetails().getEmailId());
		}
	}
	
	Purchase searchPurchaseById(int purchaseId)
	{
		for(Purchase purchase:purchaseList)
		{
			if(purchase.getId() == purchaseId)
			{
				return purchase;
			}
		}
		return null;
	}
	
	//Medicine Management function calls 
	void addMedicine()
	{
		
		boolean yes = true;
		
		while(yes)
		{
			 System.out.println("Enter Medicine ID:");
				int medicineId = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Medicine Name:");
				String medicineName = sc.nextLine();
				
				System.out.println("Enter Medicine Type:");
				String medicineType = sc.nextLine();
				
				System.out.println("Enter Medicine Price:");
				double medicinePrice = sc.nextDouble();
				
				System.out.println("Enter Medicine Quantity:");
				int medicineQuantity = sc.nextInt();
				sc.nextLine();
				
				Medicine newMedicine = new Medicine(medicineId, medicineName, medicineType, medicinePrice, medicineQuantity);
				
				medicineList.add(newMedicine);
				System.out.println("New Medicine Successfully Added!!");
				System.out.println("Do you want to add more? (Y/N)");
				yes = sc.next().charAt(0) == 'Y' ? true : false;
				
		}
		medicineManagement();
		
	}
	
	
	void searchMedicine()
	{
		System.out.println("1.Search Medicine by ID");
		System.out.println("2.Search Medicine by Name");
		System.out.println("3.Exit");
        System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();
		Medicine medicineDetails;
		if(choice == 1)
		{
			System.out.println("Enter Medicine ID : ");
			int medicineId = sc.nextInt();
			medicineDetails = searchMedicineById(medicineId);
		}
		else if(choice == 2)
		{
			
			sc.nextLine();
			System.out.println("Enter Medicine Name : ");
			String medicineName = sc.nextLine();
			medicineDetails = searchMedicineByName(medicineName);
		}
		else if(choice == 3)
		{
			searchMedicine();
			return;
		}
		else
		{
			    System.out.println("Please enter valid choice !");
			    searchMedicine();	
			    return;
		}
		
		if(medicineDetails == null)
		{
			System.out.println("Sorry, Medicine not available!");
			searchMedicine();
			return;
		}
		else
		{
			System.out.println("Medicine ID        : "+medicineDetails.getId());
			System.out.println("Medicine Name      : "+medicineDetails.getName());
			System.out.println("Medicine Type      : "+medicineDetails.getType());
			System.out.println("Medicine Price     : "+medicineDetails.getPrice());
			System.out.println("Medicine Quantity  : "+medicineDetails.getQuantity());
		}
		medicineManagement();
	}
	
	void viewAllMedicines()
	{
		System.out.println("---------------------Available Medicines---------------------");
		System.out.println("ID        Name         Type        Price        Quanity");
		for(Medicine med:medicineList)
		{
			System.out.println(med.getId()+"          "+med.getName()+"          "+med.getType()+"          "+med.getPrice()+"         "+med.getQuantity());
		}
		medicineManagement();
	}
	
	//Search Medicine function calls
	Medicine searchMedicineById(int id)
	{
		for(Medicine med:medicineList)
		{
			if(med.getId() == id) 
			{
				return med;
			}
		}
		return null;
	}
	Medicine searchMedicineByName(String name)
	{
		
		for(Medicine med:medicineList)
		{
			if(med.getName().equals(name)) 
			{
				return med;
			}
		}
		return null;
	}
	
	
	//Customer Management function calls
	void addNewCustomer()
	{
        boolean yes = true;
		
		while(yes)
		{
			    System.out.println("Enter Customer ID :");
				int customerId = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Customer Name :");
				String customerName = sc.nextLine();
				
				System.out.println("Enter Customer Mobile Number :");
				long customerMobileNumber = sc.nextLong();
				
				sc.nextLine();
				System.out.println("Enter Customer Address :");
				String customerAddress = sc.nextLine();
				
				
				System.out.println("Enter Customer Email Id:");
				String customerEmailId = sc.nextLine();
				
				Customer newCustomer = new Customer(customerId, customerName, customerMobileNumber, customerAddress, customerEmailId);
				
				customerList.add(newCustomer);
				System.out.println("New Customer Successfully Added!!");
				System.out.println("Do you want to add more? (Y/N)");
				yes =(sc.next().charAt(0) == 'Y' ? true : false);
				
		}
		customerManagement();
	}
	void updateCustomer()
	{
		System.out.println("1.Search Customer by ID");
		System.out.println("2.Search Customer by Name");
		System.out.println("3.Exit");
        System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();
		Customer customerDetails;
		if(choice == 1)
		{
			System.out.println("Enter Customer ID : ");
			int customerId = sc.nextInt();
			customerDetails = searchCustomerById(customerId);
		}
		else if(choice == 2)
		{
			
			sc.nextLine();
			System.out.println("Enter Customer Name : ");
			String customerName = sc.nextLine();
			customerDetails = searchCustomerByName(customerName);
		}
		else if(choice == 3)
		{
			searchCustomer();
			return;
		}
		else
		{
			    System.out.println("Please enter valid choice !");
			    searchCustomer();
				return;
		}
		
		if(customerDetails == null)
		{
			System.out.println("Sorry, Customer not available!");
			searchCustomer();
			return;
		}
		else
		{
			 System.out.println("Enter Customer ID :");
				int customerId = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Customer Name :");
				String customerName = sc.nextLine();
				
				System.out.println("Enter Customer Mobile Number :");
				long customerMobileNumber = sc.nextLong();
				
				sc.nextLine();
				System.out.println("Enter Customer Address :");
				String customerAddress = sc.nextLine();
				
				
				System.out.println("Enter Customer Email Id:");
				String customerEmailId = sc.nextLine();
				
				customerDetails.setId(customerId);
				customerDetails.setName(customerName);
				customerDetails.setMobileNumber(customerMobileNumber);
				customerDetails.setAddress(customerAddress);
				customerDetails.setEmailId(customerEmailId);
		}
		customerManagement();
		
	}
	void searchCustomer()
	{
		System.out.println("1.Search Customer by ID");
		System.out.println("2.Search Customer by Name");
		System.out.println("3.Exit");
        System.out.println("Enter your choice : ");
		
		int choice = sc.nextInt();
		Customer customerDetails;
		if(choice == 1)
		{
			System.out.println("Enter Customer ID : ");
			int customerId = sc.nextInt();
			customerDetails = searchCustomerById(customerId);
		}
		else if(choice == 2)
		{
			
			sc.nextLine();
			System.out.println("Enter Customer Name : ");
			String customerName = sc.nextLine();
			customerDetails = searchCustomerByName(customerName);
		}
		else if(choice == 3)
		{
			searchCustomer();
			return;
		}
		else
		{
			    System.out.println("Please enter valid choice !");
			    searchCustomer();
				return;
		}
		
		if(customerDetails == null)
		{
			System.out.println("Sorry, Customer not available!");
			searchCustomer();
			return;
		}
		else
		{
			System.out.println("Customer ID                 : "+customerDetails.getId());
			System.out.println("Customer Name               : "+customerDetails.getName());
			System.out.println("Customer Mobile Number      : "+customerDetails.getMobileNumber());
			System.out.println("Customer Address            : "+customerDetails.getAddress());
			System.out.println("Customer Email Id           : "+customerDetails.getEmailId());
		}
		customerManagement();
	}
	void viewAllExistingCustomers()
	{
		System.out.println("---------------------Existing Customer---------------------");
		System.out.println("ID        Name         Mobile Number        Address        Email Id");
		for(Customer cus:customerList)
		{
			System.out.println(cus.getId()+"          "+cus.getName()+"                  "+cus.getMobileNumber()+"          "+cus.getAddress()+"         "+cus.getEmailId());
		}
		customerManagement();
	}
	
	//Search Customer
	Customer searchCustomerById(int id)
	{
		for(Customer cus:customerList)
		{
			if(cus.getId() == id)
			{
				return cus;
			}
 		}
		
		return null;
	}
	Customer searchCustomerByName(String name)
	{
		for(Customer cus:customerList)
		{
			if(cus.getName().equals(name))
			{
				return cus;
			}
 		}
		
		return null;
	}
	
	@SuppressWarnings("deprecation")
	//Purchase Management function calls
	void addNewPurchase()
	{
		 boolean yes = true;
			
			while(yes)
			{
				    System.out.println("Enter Purchase ID :");
					int purchaseId = sc.nextInt();
					
					Date date = new Date();
					sc.nextLine();
					System.out.println("Enter Date in this format(DD:MM:YYYY) :");
					String dateFormat = sc.nextLine();
					String[] dateDetails = dateFormat.split(":");
					date.setDate(Integer.parseInt(dateDetails[0]));
					date.setMonth(Integer.parseInt(dateDetails[1]));
					date.setYear(Integer.parseInt(dateDetails[2]));
					
					
					boolean check = true;
					List<Medicine> purchaseItems = new ArrayList<Medicine>();
					while(check)
					{
						System.out.println("Enter Medicine Id :");
						Medicine med = searchMedicineById(sc.nextInt());
						if(med == null)
						{
							System.out.println("Sorry, Medicine Not Available :");
							continue;
						}
						else
						{
							med.setQuantity(med.getQuantity()-1);
							purchaseItems.add(med);
						}
						sc.nextLine();
						System.out.println("New medicine Successfully Added!!");
						System.out.println("Do you want to add more medicines? (Y/N)");
						check = (sc.next().charAt(0) == 'Y' ? true : false);
					}
					
					double totalAmount = 0;
					
					for(Medicine med:purchaseItems)
					{
						totalAmount += med.getPrice();
					}
					
					sc.nextLine();
					System.out.println("Enter Customer Id :");
					int customerId = sc.nextInt();
					
					Customer customerDetails = searchCustomerById(customerId);
					
					if(customerDetails == null)
					{
						System.out.println("Sorry, Customer Not Available :");
						addNewPurchase();
						return;
					}
					
					//Adding all medicines to the customer.
					
					for(Medicine med:purchaseItems)
					{
						customerDetails.getMedicineList().add(med);
					}
					Purchase newCustomer = new Purchase(purchaseId, date, purchaseItems, totalAmount, customerDetails);
					
					purchaseList.add(newCustomer);
					System.out.println("New Purchase Successfully Added!!");
					System.out.println("Do you want to add more? (Y/N)");
					yes = (sc.next().charAt(0) == 'Y' ? true : false);
					
			}
			purchaseManagement();
	}
	@SuppressWarnings("deprecation")
	void viewAllPurchase()
	{
		for(Purchase purchase:purchaseList)
		{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Purchase ID :"+purchase.getId());
			System.out.println("Date(DD:MM:YYYY) :"+purchase.getDate().getDay()+":"+purchase.getDate().getMonth()+":"+purchase.getDate().getYear());
			List<Medicine> listOfMedicines = purchase.getPurchaseItems();
			System.out.println("ID        Name         Type        Price        Quanity");
			for(Medicine med:listOfMedicines)
			{
				System.out.println(med.getId()+"          "+med.getName()+"          "+med.getType()+"          "+med.getPrice()+"         "+med.getQuantity());
			}
			System.out.println("Total Amount :"+purchase.getTotalAmount());
			
			System.out.println("ID        Name         Mobile Number        Address        Email Id");
			System.out.println(purchase.getCustomerDetails().getId()+"          "+purchase.getCustomerDetails().getName()+"                  "+purchase.getCustomerDetails().getMobileNumber()+"          "+purchase.getCustomerDetails().getAddress()+"         "+purchase.getCustomerDetails().getEmailId());

		}
		purchaseManagement();
	}
//	@SuppressWarnings("deprecation")
//	void todayPurchase()
//	{
//		for(Purchase purchase:purchaseList)
//		{
//			if(purchase.getDate() == (new Date().getDate()))
//			{
//				
//			
//			System.out.println("-----------------------------------------------------------------");
//			System.out.println("Purchase ID :"+purchase.getId());
//			System.out.println("Date(DD:MM:YYYY) :"+purchase.getDate().getDay()+":"+purchase.getDate().getMonth()+":"+purchase.getDate().getYear());
//			List<Medicine> listOfMedicines = purchase.getPurchaseItems();
//			System.out.println("ID        Name         Type        Price        Quanity");
//			for(Medicine med:listOfMedicines)
//			{
//				System.out.println(med.getId()+"          "+med.getName()+"          "+med.getType()+"          "+med.getPrice()+"         "+med.getQuantity());
//			}
//			System.out.println("Total Amount :"+purchase.getTotalAmount());
//			
//			System.out.println("ID        Name         Mobile Number        Address        Email Id");
//			System.out.println(purchase.getCustomerDetails().getId()+"          "+purchase.getCustomerDetails().getName()+"                  "+purchase.getCustomerDetails().getMobileNumber()+"          "+purchase.getCustomerDetails().getAddress()+"         "+purchase.getCustomerDetails().getEmailId());
//
//			}
//		}
//		purchaseManagement();
//	}
	
	
	public static void main(String[] args) {
		
	    MedicalStoreManagement object = new MedicalStoreManagement();
	    
	    object.getDetails();
	}

}
