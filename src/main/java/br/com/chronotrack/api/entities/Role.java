package br.com.chronotrack.api.entities;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Role {

    ADMIN(Name.ADMIN),
    LEAD(Name.LEAD),
    EMPLOYEE(Name.EMPLOYEE);

    public static class Name {
        public static final String ADMIN = "Admin";
        public static final String LEAD = "Lead";
        public static final String EMPLOYEE = "Employee";
    }

    private final String description;

    Role(String description) {
        this.description = description;
    }

    @Override
    @JsonValue
    public String toString() {
        return this.description;
    }
}
