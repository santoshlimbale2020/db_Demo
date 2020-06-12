package com.db.awmd.challenge.service;

import com.db.awmd.challenge.domain.Account;
import com.db.awmd.challenge.domain.Transfer;
import com.db.awmd.challenge.exception.TransferFundException;
import com.db.awmd.challenge.repository.TransferRepository;

import lombok.Getter;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferService {

	@Getter
	public final AccountRepository accountRepository;

	@Autowired
	AccountsService accountServce;

	@Autowired
	public TransferService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public void transferAmount(String accountFrom, String accountTo, BigDecimal amount) {
		this.accountRepository.transferAmount(accountFrom, accountTo, amount);
	}
}
