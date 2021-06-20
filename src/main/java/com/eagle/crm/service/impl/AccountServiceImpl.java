package com.eagle.crm.service.impl;

import com.eagle.crm.bean.Account;
import com.eagle.crm.mapper.AccountMapper;
import com.eagle.crm.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

//    @Autowired
    AccountMapper accountMapper;

    public Account getAcctByid(Long id){
        return accountMapper.getAcct(id);
    }
}
