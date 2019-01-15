package com.jerryring.entitiy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author broker
 * @version v1.0
 * @date 2018-09-26
 */
@Entity
@Table(name = "t_user")

public class User implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private Long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_age")
    private Integer age;

    @Column(name = "t_address")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
