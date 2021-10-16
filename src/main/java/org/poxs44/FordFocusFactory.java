package org.poxs44;

public class FordFocusFactory {

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

}
