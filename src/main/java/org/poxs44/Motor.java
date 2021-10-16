package org.poxs44;

public abstract class Motor {
    public String motor;

    public abstract String presentamotor();
    public String getmotor(){
        return motor;
    }

    public void setmotor(String motor){
        this.motor=motor;
    }
}
