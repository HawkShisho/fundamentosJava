//Mi clase
public class HolaMundo {
    public static void main(String args[]){
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        var miVariableEntera2=15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2= "Nueva cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        var miVariable = 1;
        var _miVariable = 2;
        var $MiVariable = 3;
        //var áVariable = 10; No se recomienda utilizar
        //var #miVariable = 10; No se permite utilizar caracteres especiales
    }
}
