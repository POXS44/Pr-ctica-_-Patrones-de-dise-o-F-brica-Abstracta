package org.poxs44;

public abstract class Sistema_Sonido {

    public String sistemasonido;

    public abstract String presistemasonido();
    public String getSistemasonido(){return sistemasonido;}

    public void setSistemasonido(String sistemasonido) {this.sistemasonido=sistemasonido;}
}
