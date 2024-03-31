import java.util.ArrayList;
public class actividad {

    public class alumno{
        String nombre;
        materia[] materiasAprobadas = new materia[40];
    }

    public class materia{
        String nombre;

        materia[] correlativas = new materia[40];

        boolean chequearCorrelativas(alumno alumno){
            boolean estado = false;
            for( materia correlativa : this.correlativas){
                for(materia aprobada : alumno.materiasAprobadas ){
                    if(correlativa.nombre.equals(aprobada.nombre)){
                        estado = true;
                        break;
                    }
                estado = false;
                }
            if(!estado){break;}
            }
            return estado;
        }
    }

    public class inscripcion{
        alumno estudiante;
        materia[] materiasInscripta= new materia[40];

        boolean aprobada(alumno alumno,materia[] materias){

            for(materia materia:materiasInscripta){
                if(!materia.chequearCorrelativas(this.estudiante)) {
                    return false;
                }
            }
        return true;
        }
    }
}
