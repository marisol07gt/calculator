/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversiondetipos;

/**
 *
 * @author tovar
 */
public class MetodosTextuales {
    public static void main(String[] agrs){
        
        String numero = "415-111-64-89";
        //el lugar  donde se encuentran los guiones
        int indexGuion = numero.indexOf("-");
        //retornar donde se encuentra el guion
        System.out.println(indexGuion);
        int index2 = numero.indexOf("-", indexGuion+1);
        System.out.println(index2);
        int index3 = numero.indexOf("-", index2+1);
        System.out.println(index3);
        int index4 = numero.indexOf("-", index3+1);
        System.out.println(index4);
        System.out.println(numero.charAt(2));
        //despues de, subString
        System.out.println(numero.substring(4));
        System.out.println(numero.substring(4,10));
        
        String texto = "texto a remplazar";
        System.out.println(texto.replace("a", "A"));
        System.out.println(texto.replace("ee", "-"));
        //replace solamnete una vez , replaceFirst
        String textoR = "replaceFrirst";
        System.out.println(textoR.replaceFirst("replace","RE"));
        //replace toda la palabra, replaceAll
        String textoV = "replaceFrirst";
        System.out.println(textoV.replaceAll("Hola","Adios"));
        String hola = "Hola";
        String mundo = "Mundo";
        System.out.println(hola.concat("").concat(mundo));
        System.out.println("JAVA"+21);
        System.out.println("SUMA" + (17+17));
        
        String word = "palabra";
        String palabra = new String ("palabra");
        
        String word2 = "palabra";
        //compareTo compara 2 String
        System.out.println(word.compareTo(palabra));//cuando las palabras sean iguales retornara 0,
        //si es falso
        System.out.println(word.compareToIgnoreCase(word2));
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
    }
    
}
