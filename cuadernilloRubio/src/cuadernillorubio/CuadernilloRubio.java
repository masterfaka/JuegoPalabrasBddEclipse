/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadernillorubio;

/**
 *
 * @author Mañanas
 */
public class CuadernilloRubio {
    static boolean respuestaCorrecta(Operacion o, int r){
            boolean c=o.getResultado()==r;
            return c;
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=EntradaSalida.mostrarMenu();
        //Menu: 1-Sumas 2-Restas 3-Multiplicaciones 4-Salir
        // el nombre se preguntaria al principio (antes del while de menu(varias operaciones))
        while(opcion!=4)
        {
                //como ya se la operacion, ponemos aki el incrementar de nro_operaciones
            switch (opcion)
            {
                        case 1:
                            int numero_operaciones=EntradaSalida.preguntarCuantas();
//Este metodo pregunta cuantas operaciones quiere hacer
                            String nombre_usuario=EntradaSalida.preguntarNombre();
                            int operaciones_hechas=0;
                            while(operaciones_hechas<numero_operaciones)
                            {
                            Operacion o=Operacion.obtenerSuma();
//Este metodo devuelve un objeto Operacion, que tiene como propiedades los 2 sumandos,
//el resultado y el signo + y e
                            int respuesta_usuario=EntradaSalida.mostrarOperacion(o);//acer sout
                            if(respuestaCorrecta(o, respuesta_usuario))
                                {
                                    EntradaSalida.darEnhorabuena(nombre_usuario);
                                }else{System.out.println("Teekivocaste co");}
                            operaciones_hechas++;
                            }  
                            break;
                        case 2:
                            //Lo mismo pero con resta
                            numero_operaciones=EntradaSalida.preguntarCuantas();
//Este metodo pregunta cuantas operaciones quiere hacer
                            nombre_usuario=EntradaSalida.preguntarNombre();
                            operaciones_hechas=0;
                            while(operaciones_hechas<numero_operaciones)
                            {
                            Operacion o=Operacion.obtenerResta();
//Este metodo devuelve un objeto Operacion, que tiene como propiedades los 2 sumandos,
//el resultado y el signo + y e
                            int respuesta_usuario=EntradaSalida.mostrarOperacion(o);//acer sout
                            if(respuestaCorrecta(o, respuesta_usuario))
                                {
                                    EntradaSalida.darEnhorabuena(nombre_usuario);
                                }
                            operaciones_hechas++;
                            }  
                            break;
                        case 3:
                            //Lo mismo pero con resta
                             numero_operaciones=EntradaSalida.preguntarCuantas();
//Este metodo pregunta cuantas operaciones quiere hacer
                            nombre_usuario=EntradaSalida.preguntarNombre();
                            operaciones_hechas=0;
                            while(operaciones_hechas<numero_operaciones)
                            {
                            Operacion o=Operacion.obtenerMulti();
//Este metodo devuelve un objeto Operacion, que tiene como propiedades los 2 sumandos,
//el resultado y el signo + y e
                            int respuesta_usuario=EntradaSalida.mostrarOperacion(o);//acer sout
                            if(respuestaCorrecta(o, respuesta_usuario))
                                {
                                    EntradaSalida.darEnhorabuena(nombre_usuario);
                                }
                            operaciones_hechas++;
                            } 
                            break;
                        default:System.out.println("Opcion incorrecta([1 -- 4])");
                            break;
            }
            opcion=EntradaSalida.mostrarMenu();
        }
        

    }
    
}
