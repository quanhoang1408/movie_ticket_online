package com.example.onlinemovieticket.role;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_USER("USER"),
    ROLE_STAFF("STAFF"),
    ROLE_ADMIN("ADMIN");;

    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getAuthority() {
        return value;
    }
}
