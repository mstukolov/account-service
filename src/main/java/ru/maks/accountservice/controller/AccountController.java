package ru.maks.accountservice.controller;


import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.maks.accountservice.domain.Account;
import ru.maks.accountservice.service.AccountService;

@RestController
public class AccountController {

  @Autowired
  private AccountService accountService;

  @RequestMapping(path = "/{name}", method = RequestMethod.GET)
  public Account getAccountByName(@PathVariable String name) {
    return accountService.findByName(name);
  }

  @RequestMapping(path = "/all", method = RequestMethod.GET)
  public List<Account> getAll() {
    return accountService.getAll();
  }

  @RequestMapping(path = "/create/{name}", method = RequestMethod.GET)
  public void create(@PathVariable String name) {
    Account account = new Account();
    account.setName(name);
    account.setLastSeen(new Date());
    accountService.create(account);
  }



}
