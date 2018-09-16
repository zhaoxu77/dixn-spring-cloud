package com.dixn.spring.cloud.common.service.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2018-09-16 22:15
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
