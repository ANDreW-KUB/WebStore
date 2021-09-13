package org.example.service;

import org.example.model.user_account.UserAccount;

import java.util.List;

public interface UserAccountService {
    public List<UserAccount> getAllUserAccount();

    public UserAccount getUserAccount(long id);

    public void saveUserAccount(UserAccount userAccount);

    public void deleteUserAccount(long id);

}
