
// GENESIS ROSADO BANCHON

//clase principal donde se ejecuta el programa
package cuentas_pacifico;


public class Cuentas_Pacifico {

    
    public static void main(String[] args) {
        //instancia la clase Cuenta Ahorros
        Cuenta_Ahorro ahorro = new Cuenta_Ahorro();
        //llamo a los metodos heredados de la clase padre que es cuenta 
        ahorro.Cuenta_Ahorros();
        //llamo a los metodos de la clase hija Cuenta Ahorros
        ahorro.datos();
        
        //instancia la clase Cuenta Correiente
        Cuenta_corriente corriente = new Cuenta_corriente();
        //llamo a los metodos heredados de la clase padre que es cuenta
        corriente.Cuenta_Corrientes();
        //llamo a los metodos de la clase hija Cuenta Corriente
        corriente.Datos_corriente();
        
        //instancia la clase Cuenta Juvenil
        Cuenta_juvenil juvenil = new Cuenta_juvenil();
        //llamo a los metodos heredados de la clase padre que es cuenta
        juvenil.Cuenta_Juveniles();
        //llamo a los metodos de la clase hija Cuenta Juvenil
        juvenil.Datos_juvenil();
    }
    
}
