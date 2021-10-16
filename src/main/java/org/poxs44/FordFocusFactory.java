package org.poxs44;

public class FordFocusFactory implements CocheFactory {

    @Override
    public Motor crearMotor() {
        // TODO Auto-generated method stub
        return new FMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
        // TODO Auto-generated method stub
        return new FCarroceria();
    }
    @Override
    public Sistema_Sonido crearsistemasonido() {
        // TODO Auto-generated method stub
        return new FSistemaSonido();
    }

}
