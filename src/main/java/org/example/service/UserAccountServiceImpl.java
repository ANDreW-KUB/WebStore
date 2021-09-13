package org.example.service;

import org.example.model.user_account.UserAccount;
import org.example.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    UserAccountRepository userAccountRepository;

    @Override
    public List<UserAccount> getAllUserAccount() {
        return userAccountRepository.findAll();
    }

    @Override
    public UserAccount getUserAccount(long id) {
        return userAccountRepository.getOne(id);
    }

    @Override
    public void saveUserAccount(UserAccount userAccount) {
        userAccountRepository.save(userAccount);
    }

    @Override
    public void deleteUserAccount(long id) {
        userAccountRepository.deleteById(id);
    }
}
