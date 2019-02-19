package ru.maks.accountservice.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.maks.accountservice.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, String> {
  Account findByName(String name);
  List<Account> findAll();
  Account save(Account account);
}
