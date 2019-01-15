package com.jerryring.mapper;

import com.jerryring.entitiy.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author broker
 * @version v1.0
 * @date 2018-09-26
 */

@Mapper
public interface UserMapper {
    List<User> getUser(Integer id);
}
