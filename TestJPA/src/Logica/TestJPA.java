package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

public class TestJPA {

    public static void main(String[] args) {

//        //Creando alumnos
////        Alumno alumno = new Alumno("39185334", "nahuel", "audisio", new Date("10/17/1995"));
//        Alumno alumno2 = new Alumno("13807537", "mario", "audisio", new Date("11/7/1953"));
////        Alumno alumno3 = new Alumno("654156", "Elena", "LOPEZ", new Date("09/19/1956"));
////        Alumno alumno4 = new Alumno("464561", "NOELIA", "AUDISIO", new Date("03/03/1991"));
//
        ControladoraPersistencia control = new ControladoraPersistencia();
//
//        // GUARDA LOS ALUMNOS CREADOS
////        control.crearAlumno(alumno);
//        control.crearAlumno(alumno2);
////        control.crearAlumno(alumno3);
////        control.crearAlumno(alumno4);
////        
//        
//// ahora quiero borrar un dato de la base de datos
//
////control.eliminarAlumno("13807537");
//// funciono jeje
//
////ahora quiero modificar algo de algun dato
//alumno2.setApellido("SEBASTIAN");
//alumno2.setNombre("RICARDO");
//control.modificarAlumno(alumno2);



//List <Alumno> listaAlumnos = control.traerAlumnos();
//
//        System.out.println("LISTA DE ALUMNOS REGISTRADOS EN NUESTRA BASE DE DATOS");
//        
//        for (Alumno alu : listaAlumnos) {
//            
//            System.out.println(alu.toString());
//        }

Alumno alu = control.traerAlumnoParticular("39185334");

        System.out.println(alu.toString());

    }

}
