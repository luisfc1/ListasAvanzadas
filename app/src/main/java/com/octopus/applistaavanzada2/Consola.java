package com.octopus.applistaavanzada2;

class Consola {
    private String nombreConsola;
    private String nombreEmpresa;
    private int fotoResourse;

    public Consola(String n, String e, int r){
        this.nombreConsola = n;
        this.nombreEmpresa = e;
        this.fotoResourse = r;
    }

    public String getNombreConsola() {
        return nombreConsola;
    }

    public void setNombreConsola(String nombreConsola) {
        this.nombreConsola = nombreConsola;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getFotoResourse() {
        return fotoResourse;
    }

    public void setFotoResourse(int fotoResourse) {
        this.fotoResourse = fotoResourse;
    }
}
