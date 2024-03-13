package com.dailycodework.breezehotel.service;

import com.dailycodework.breezehotel.model.User;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
