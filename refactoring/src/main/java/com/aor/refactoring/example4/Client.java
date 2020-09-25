package com.aor.refactoring.example4;

public class Client {
    private final String name;
    private final String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public boolean login(String username, String password) {
        return false;
    }
}
