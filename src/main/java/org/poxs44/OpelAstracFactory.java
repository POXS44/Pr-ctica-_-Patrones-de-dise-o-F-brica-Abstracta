package org.poxs44;

public class OpelAstracFactory implements CocheFactory{
    @Override
    public Motor crearMotor() {
        // TODO Auto-generated method stub
        return new AMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
        // TODO Auto-generated method stub
        return new ACarroceria();
    }

    @Override
    public Sistema_Sonido crearsistemasonido() {
        // TODO Auto-generated method stub
        return new HSistemaSonido();
    }

}
