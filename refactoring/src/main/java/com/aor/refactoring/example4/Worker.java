package com.aor.refactoring.example4;

import java.util.Objects;

public class Worker extends WorkingPerson{
    public Worker(String name, String phone, String username, String password) {
        super(name, phone, username, password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(getName(), worker.getName()) &&
                Objects.equals(getPhone(), worker.getPhone()) &&
                Objects.equals(getUsername(), worker.getUsername()) &&
                Objects.equals(getPassword(), worker.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhone(), getUsername(), getPassword());
    }
}
