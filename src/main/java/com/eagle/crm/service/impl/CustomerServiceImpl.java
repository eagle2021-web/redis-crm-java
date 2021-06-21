package com.eagle.crm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eagle.crm.entity.Customer;
import com.eagle.crm.mapper.CustomerMapper;
import com.eagle.crm.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper,Customer> implements CustomerService {
}
