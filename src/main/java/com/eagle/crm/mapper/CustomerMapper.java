package com.eagle.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eagle.crm.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {
}
