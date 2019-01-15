package com.jerryring.jpa;

import com.jerryring.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author broker
 * @version v1.0
 * @date 2018-09-26
 */
public interface UserJPA extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>,Serializable {
}
