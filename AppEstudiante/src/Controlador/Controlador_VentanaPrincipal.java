/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ManipulaCursos;
import Vista.ManipulaEstudiantes;
import Vista.ManipulaMatricula;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carolina
 */
public class Controlador_VentanaPrincipal implements ActionListener {

    private ManipulaEstudiantes maniEstudiante;
    private ManipulaCursos maniCursos;
    private ManipulaMatricula manipulaMatricula;

    public Controlador_VentanaPrincipal() {
        this.maniEstudiante = new ManipulaEstudiantes();
        this.maniCursos = new ManipulaCursos();
        this.manipulaMatricula = new ManipulaMatricula();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Salir")){
             System.exit(0);
        }
        if(e.getActionCommand().equals("Manipular estudiantes")){
            maniEstudiante.setVisible(true);
        }
        if(e.getActionCommand().equals("Manipular cursos")){
            maniCursos.setVisible(true);
        }
        if(e.getActionCommand().equalsIgnoreCase("Matricular")){
            manipulaMatricula.setVisible(true);
        }
        
    }
    
}
