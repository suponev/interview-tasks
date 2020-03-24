package it.suponev.jit.junior.one.model;

public class Client {

    private String name;
    private Status status;

    public Client(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }
}
