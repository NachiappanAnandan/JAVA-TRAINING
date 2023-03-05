package Action;

import java.util.ArrayList;
import java.util.List;

import DAO.CustomerDAO;
import DAO.CustomerDAOusage;
import DAO.InvoiceDAO;
import DAO.InvoiceDAOusage;
import DAO.ItemDAO;
import DAO.ItemDAOusage;
import DAO.TransactionDAO;
import DAO.TransactionDAOusage;
import DTO.CustomerDTO;
import DTO.InvoiceDTO;
import DTO.ItemDTO;
import DTO.TransactionDTO;

public class UseDatabase {
public static void main(String[] args) {
	CustomerDAO customer = new CustomerDAOusage();
	CustomerDTO demo  = new CustomerDTO();
	
	ItemDAO item = new 	ItemDAOusage();
	ItemDTO demoItem = new ItemDTO();
	
	InvoiceDAO invoice  = new InvoiceDAOusage();
	InvoiceDTO demoInvoice = new InvoiceDTO();
	
	TransactionDAO transaction = new TransactionDAOusage();
	List<TransactionDTO> demoTransactions = new ArrayList<>();
	
	demoTransactions = (List<TransactionDTO>) transaction.findByInvoice(1);
	
	
	
	
	
	//Transaction operations
	
//	System.out.println(demoTransactions.get(1).getItemQuantity());
	
//	TransactionDTO singleTransaction = new TransactionDTO();
//	
//	singleTransaction = demoTransactions.get(1);
//	
//	singleTransaction.setItemQuantity(8);
//	
//	System.out.println(transaction.updateTransaction(singleTransaction));
//	
	
	
	//customer operations
	
//	System.out.println(customer.findById(1));
//	System.out.println(customer.findByName("ajay"));
//	System.out.println(customer.findAll());
//	demo.setId(1);
//	demo.setName("Raju");
//	demo.setAddress("Taramani chennai");
//	System.out.println(demo.getAddress());
	
//	
	
	//Item operations
//	System.out.println(item.findById(1));
//	System.out.println(item.findByName("milk"));
//	System.out.println(item.findAll());
//	demoitem = item.findByName("milk");
//	System.out.println(demoitem.getPrice());
//	demoitem.setDescription("curd");
//	int r = item.updateItem(demoitem);
//	System.out.println(r);
//	System.out.println(customer.updateCustomer(demo));
	
	
	//invoice operations
	
//	
//	demoInvoice = invoice.findByCustomer(3);
//	demoInvoice.setDate("05-03-2023");
//	System.out.println(invoice.updateInvoice(demoInvoice));
	
	
	
	
	
}





}
