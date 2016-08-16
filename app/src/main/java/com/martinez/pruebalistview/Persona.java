package com.martinez.pruebalistview;


public class Persona
{
    private String fullName;
    private String universidad;
    private String profesion;
    private int foto;

    public Persona( String fullName, String universidad, String profesion, int foto )
    {
        this.fullName = fullName;
        this.universidad = universidad;
        this.profesion = profesion;
        this.foto = foto;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
