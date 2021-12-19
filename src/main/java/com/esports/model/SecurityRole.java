package com.esports.model;

import java.util.Arrays;
import java.util.List;

public enum SecurityRole {
    USER,
    ADMIN;

    public List<SecurityRole> getRoles() {
        return Arrays.asList(SecurityRole.values());
    }
}
