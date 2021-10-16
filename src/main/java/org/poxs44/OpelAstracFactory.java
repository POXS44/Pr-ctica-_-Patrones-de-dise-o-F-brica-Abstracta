package org.poxs44;

public class OpelAstracFactory {
    @Override
    public Motor crearMotor() {
        // TODO Auto-generated method stub
        return new AMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
        // TODO Auto-generated method stub
        return new ACarrosseria();
    }

}
