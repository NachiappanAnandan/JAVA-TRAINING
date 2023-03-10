package DAO;

import java.util.Collection;

import DTO.TransactionDTO;

public interface TransactionDAO {
	public Collection<TransactionDTO> findByInvoice(int id);
	public int updateTransaction(TransactionDTO transaction);
	public int deleteTransaction(int invoiceId);
}
