package org.example.dto;

import java.util.Set;

public class userDTO{
    private String name;
    private String email;
    private Set<String> roles;


    public userDTO() {
    }

    public userDTO(String name, String email, Set<String> roles) {
        this.name = name;
        this.email = email;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
