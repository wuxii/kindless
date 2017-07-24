package com.harmony.kindless.domain.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.harmony.umbrella.data.domain.BaseEntity;

/**
 * @author wuxii@foxmail.com
 */
@Entity
@Table(name = "K_USER")
public class User extends BaseEntity<String> {

    private static final long serialVersionUID = 1L;

    @Id
    private String username;
    private String password;
    private String email;
    private String address;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(//
            name = "K_USER_ROLE", //
            joinColumns = { @JoinColumn(name = "username", referencedColumnName = "username") }, //
            inverseJoinColumns = { @JoinColumn(name = "role_code", referencedColumnName = "code") }//
    )
    private List<Role> roles;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getId() {
        return username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{username:" + username + ", password:" + password + "}";
    }

}
