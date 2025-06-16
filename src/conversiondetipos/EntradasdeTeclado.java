package conversiondetipos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tovar
 */
public class EntradasdeTeclado {
    public static void main(String[] args) {
        System.out.println("");
        //byte numero = 128; //-127 hasta 127 
       //byte solo permite numeros desde -127 a 127 positivo
       short numero = 129;//convertir a byte
       byte numeroNuevo = 0;
        System.out.println("numero actual "+ numeroNuevo);
        
       // numeroNuevo = numeroNuevo+1; incorrecto
       numeroNuevo = numeroNuevo--;//correcto
       //casteo conversion
       double pi = 3.1416;
       int nuevoPi = (int)pi;
        System.out.println("Numero int de pi: " + nuevoPi);
        numeroNuevo = (byte) numero;
        System.out.println("Nuevo byte: " + numeroNuevo);
        
        String shirtPrice = "15";
        String taxRate = "0.05";
        String Girebish = "6439dhge";
        int intShirt = Integer.parseInt(shirtPrice);
        System.out.println(intShirt);
        double doubleTax = Double.parseDouble(taxRate);
        System.out.println(doubleTax);
       double doubleGirebish = Double.parseDouble(Girebish);
        System.out.println(doubleGirebish);
    }
}
    

