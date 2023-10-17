package com.integrador;

public class Entrenador extends IntegranteSeleccion{
    
    private String nacionalidad = " ";



public Entrenador(String nombre, String apellido, double sueldoBasico, int hijos, String nacionalidad){
    this.nombre= nombre;
    this.apellido=apellido;
    this.sueldoBasico= sueldoBasico;
    this.hijos=hijos; 
    this.nacionalidad= nacionalidad;


}


public Entrenador(String nombre, String apellido, double sueldoBasico, String nacionalidad){
    this.nombre= nombre;
    this.apellido=apellido;
    this.sueldoBasico= sueldoBasico;
    this.nacionalidad= nacionalidad;


}

}
