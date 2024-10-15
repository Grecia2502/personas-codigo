package com.mycompany.mavenproject8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class estudiante {
    private int matricula;
    
    public estudiante(String nombre, String apellidos, int edad, int mat){
        super(nombre, apellidos, edad);
        this.matricula = mat;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int mat){
        this.matricula = mat;
    }
}