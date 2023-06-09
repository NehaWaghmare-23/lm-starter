package com.lmpay.starter.service;

import com.lmpay.starter.exception.CustomException;
import com.lmpay.starter.model.Transaction;
import com.lmpay.starter.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(Long id) {
        return transactionRepository.findById(id).orElseThrow(() -> new CustomException("Transaction not found By ID"));

    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(Long id, Transaction transaction) {
        Transaction transaction1 = this.transactionRepository.findById(id)
                .orElseThrow(() -> new CustomException("Transaction not found By ID"));

        transaction1.setTransactionNo(transaction.getTransactionNo());
        transaction1.setSendingAgentCode(transaction.getSendingAgentCode());
        transaction1.setProviderCode(transaction.getProviderCode());
        transaction1.setDeliveryOption(transaction.getDeliveryOption());
        transaction1.setCardCharges(transaction.getCardCharges());
        transaction1.setValueDate(transaction.getValueDate());
        transaction1.setPayoutAmount(transaction.getPayoutAmount());
        transaction1.setPayinAmount(transaction.getPayinAmount());
        transaction1.setCommission(transaction.getCommission());
        transaction1.setTax(transaction.getTax());
        transaction1.setOtherCharges(transaction.getOtherCharges());
        transaction1.setAdditionalCharges(transaction.getAdditionalCharges());
        transaction1.setTotalPayinAmount(transaction.getTotalPayinAmount());
        transaction1.setXRateUSD2Payin(transaction.getXRateUSD2Payin());
        transaction1.setXRateUSD2Payout(transaction.getXRateUSD2Payout());
        transaction1.setAgentExchangeRate(transaction.getAgentExchangeRate());
        transaction1.setTaxInSettlementCCY(transaction.getTaxInSettlementCCY());
        transaction1.setCommissionInSettlementCCY(transaction.getCommissionInSettlementCCY());
        transaction1.setCardChargesInSettlementCCY(transaction.getCardChargesInSettlementCCY());
        transaction1.setXRateUSD2SettlementCCY(transaction.getXRateUSD2SettlementCCY());

        return transactionRepository.save(transaction1);


    }

    public boolean deleteTransaction(Long id) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new CustomException("Transaction not found By ID"));

        transactionRepository.delete(transaction);
        return false;
    }
}


