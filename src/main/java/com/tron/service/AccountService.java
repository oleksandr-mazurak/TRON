package com.tron.service;
import java.security.Principal;
import com.tron.domain.PrimaryAccount;
import com.tron.domain.PrimaryTransaction;
import com.tron.domain.SavingsAccount;
import com.tron.domain.SavingsTransaction;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);

    }
