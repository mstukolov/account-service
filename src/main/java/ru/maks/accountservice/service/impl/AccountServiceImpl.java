package ru.maks.accountservice.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.maks.accountservice.domain.Account;
import ru.maks.accountservice.repository.AccountRepository;
import ru.maks.accountservice.service.AccountService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class AccountServiceImpl implements AccountService {

  private final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

  @Autowired
  private AccountRepository repository;

  @Override
  public Account findByName(String accountName) {
    log.debug("Request to get Current Account");
    return repository.findByName(accountName);
  }

  @Override
  public List<Account> getAll() {
    log.debug("Request to get LIST ALL Accounts");
    return repository.findAll();
  }

  @Override
  public Account create(Account account) {
    log.debug("Request to create Account");
        return repository.save(account);

  }
}
