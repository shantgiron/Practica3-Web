package model;


import java.io.Serializable;

public class Usuario implements Serializable {
    private String username;
    private String nombre;
    private long id;
    private String password;
    private  boolean administrator;
    private boolean autor ;


   public Usuario (){

    }

    public Usuario(Long id, String username, String nombre, String password, boolean administrator, boolean autor) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.password = password;
        this.administrator = administrator;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

    public boolean isAutor() {
        return autor;
    }

    public void setAutor(boolean autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", administrator=" + administrator +
                ", autor=" + autor +
                '}';
    }
}

