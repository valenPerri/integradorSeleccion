package com.integrador;

public class IntegranteSeleccion {

    private String nombre = " ";
    private String apellido = " ";
    private double sueldoBasico = " ";
    private int hijos = " ";


public IntegranteSeleccion(String nombre, String apellido, double sueldoBasico, int hijos){
    this.nombre= nombre;
    this.apellido=apellido;
    this.sueldoBasico= sueldoBasico;
    this.hijos=hijos;

}

public IntegranteSeleccion(String nombre, String apellido, double sueldoBasico){
    this.nombre= nombre;
    this.apellido=apellido;
    this.sueldoBasico= sueldoBasico;
}

public String getNombre(){
    return nombre;
}

public String getApellido(){
    return apellido;
}
public double getSueldoBasico(){
    return sueldoBasico;
}

public int getHijos(){
    return hijos;
}



}