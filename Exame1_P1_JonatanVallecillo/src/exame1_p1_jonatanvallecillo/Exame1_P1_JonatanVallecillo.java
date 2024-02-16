package exame1_p1_jonatanvallecillo;

import java.util.Scanner;

public class Exame1_P1_JonatanVallecillo {

    static Scanner leer = new Scanner(System.in);
    static Scanner leer1 = new Scanner(System.in);
    
    public static void main(String[] args) {
        int menu = 1;
        while(menu == 1){
            System.out.println("**** Menu ****\n"
                    + "1. Calculador basicas\n"
                    + "2. Gramatica de un for\n"
                    + "3. Half Life");
            System.out.print("Ingrese su opcion: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    int submenu = 1;
                    int operacion = 0;
                    while(submenu == 1){
                        System.out.println("\n*** Submenu ***\n"
                            + "1. Sumas (x+y)\n"
                            + "2. Resta (x-y)\n"
                            + "3. Multiplicacion (x*y)\n"
                            + "4. Division (x/y)");
                        System.out.print("Ingrese la operacion: ");
                        operacion = leer.nextInt();
                        
                        if (operacion > 0 && operacion < 5){
                            submenu = 0;
                        }else{
                            System.out.println("Numero invalido. Intente de nuevo\n");
                        }
                    }
                    
                    int operac = 0;
                    
                    switch(operacion){
                        case 1:
                            operac = resultadosuma(operacion);
                            System.out.println(operac);
                            break;
                        case 2:
                            operac = resultadoresta(operacion);
                            System.out.println(operac);
                            break;
                    }
                    
                    break;
            }
        }
    }
    
    public static int resultadosuma(int operacion){
        String operacionS = "";
        System.out.print("Ingrese la operacion a realizar: ");
        operacionS = leer1.nextLine();
                    
        String primerdig = "";
        String segundodig = "";
        char carac = ' ';
        int suma = 0;
                    
        for(int i = 0; i < operacionS.length(); i++){
            carac = operacionS.charAt(i);
            
            if(carac == '/' || carac == '*' || carac == '-'){
                i = operacionS.length();
                System.out.println("ERROR, signo ingresado no valido en el modo de division");
                suma = -1;
            }else if(carac == '+'){
                suma += Integer.parseInt(primerdig);
                primerdig = "";
            }else{
                primerdig += operacionS.charAt(i);
            }
            
            if(i == operacionS.length() - 1){
                suma += Integer.parseInt(primerdig);
            }
        }
        System.out.println();
        return suma;
    }
    
    public static int resultadoresta(int operacion){
        String operacionS = "";
        System.out.print("Ingrese la operacion a realizar: ");
        operacionS = leer1.nextLine();
                    
        String primerdig = "";
        String segundodig = "";
        char carac = ' ';
        int resta = 0;
        int contador = 0;
                    
        for(int i = 0; i < operacionS.length(); i++){
            carac = operacionS.charAt(i);
            
            if(carac == '/' || carac == '*' || carac == '+'){
                i = operacionS.length();
                System.out.println("ERROR, signo ingresado no valido en el modo de division");
                resta = -1;
            }else if(carac == '-'){
                if(contador == 0){
                    resta += Integer.parseInt(primerdig);
                }else{
                    resta -= Integer.parseInt(primerdig);
                    primerdig = "";
                }
                contador++;
            }else{
                primerdig += operacionS.charAt(i);
            }
            
            if(i == operacionS.length() - 1){
                resta -= Integer.parseInt(primerdig);
            }
            
            System.out.println("resta "+resta);
        }
        System.out.println();
        return resta;
    }
    
}
