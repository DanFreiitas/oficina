/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oficina.Utilitarios;

/**
 *
 * @author Home
 */
public class Funcionario extends Pessoa {
    
    private String idfuncionario;
    private String matricula;

    public void setIdfuncionario(String idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdfuncionario() {
        return idfuncionario;
    }

    public String getMatricula() {
        return matricula;
    }
}
