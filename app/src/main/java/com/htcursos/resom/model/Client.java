package com.htcursos.resom.model;

import java.io.Serializable;

public class Client implements Serializable{

    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String cel;
    private int image;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (image != client.image) return false;
        if (!id.equals(client.id)) return false;
        if (!name.equals(client.name)) return false;
        if (!email.equals(client.email)) return false;
        if (!cpf.equals(client.cpf)) return false;
        return cel.equals(client.cel);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + cpf.hashCode();
        result = 31 * result + cel.hashCode();
        result = 31 * result + image;
        return result;
    }
}
