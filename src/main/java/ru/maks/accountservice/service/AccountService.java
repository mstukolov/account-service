package ru.maks.accountservice.service;

import java.util.List;
import ru.maks.accountservice.domain.Account;

public interface AccountService {

  Account findByName(String accountName);
  List<Account> getAll();
  Account create(Account account);
}
