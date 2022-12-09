//Mi clase
public class HolaMundo {
    public static void main(String args[]){
        /*
            Tipos primitivos enteros: byte, short, int ,long
        */
        byte numeroByte = (byte)129;
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor minimo byte:" + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("Numero Short = " + numeroShort);
        System.out.println("Valor minimo short:" + Short.MIN_VALUE);
        System.out.println("Valor minimo short:" + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("Numero Int = " + numeroInt);
        System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor minimo int:" + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("Numero Long = " + numeroLong);
        System.out.println("Valor minimo long:" + Long.MIN_VALUE);
        System.out.println("Valor minimo long:" + Long.MAX_VALUE);
    }
}
