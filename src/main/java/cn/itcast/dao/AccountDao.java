package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lyh
 * @date 2021/1/16-20:48
 */
@Repository
public interface AccountDao {
    @Select("select * from account")
    public List<Account> findAll();
    @Insert(value="insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
