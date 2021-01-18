package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @author lyh
 * @date 2021/1/16-20:51
 */
public interface AccountService {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
