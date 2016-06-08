/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Carolina
 */
public class Matricula extends Estudiante {
     private ArrayList<Curso> matriculados;
    
    public Matricula (Estudiante estudiante)
    {
        super (estudiante.getCarne(), estudiante.getNombre(), estudiante.getCorreo());
        matriculados = new ArrayList<> ();
    }
    
    public void addCurso(Curso curso)
    {
        matriculados.add (curso);
    }
    
    public boolean comprobarCurso(Curso curso)
    {
        return matriculados.contains (curso);
    }
    
    public int getTotalCreditos ()
    {
        int totalCreditos = 0;
        for(Curso curso : matriculados)
            totalCreditos += curso.getCreditos();
        return totalCreditos;
    }
    
    public String [][] getCursosMatriculados()
    {
        String [][] matrizCursos  = new String[3][matriculados.size ()];
        for (int i = 0; i < matrizCursos[0].length; i++) {
            matrizCursos[i] = matriculados.get (i).toString ().split ("\n");
        }
        return matrizCursos;
    }

    
}
