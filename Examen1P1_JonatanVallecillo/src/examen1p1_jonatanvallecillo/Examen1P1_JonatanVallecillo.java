package examen1p1_jonatanvallecillo;

import java.util.Random;
import java.util.Scanner;

public class Examen1P1_JonatanVallecillo {
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("Ingrese el ejercicio: ");
        int ejercicio = leer.nextInt();
        
        while (ejercicio > 0 && ejercicio < 3){            
            switch (ejercicio){
                case 1:
                    juego();
                    break;
                case 2:
                    triangulo();
            }
        }
                
    }
    
    public static void juego(){
        Random random= new Random();
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese maestria: ");
        System.out.println("1. Principiante (0% de hit extra + extra damage)");
        System.out.println("2. Intermedio (5% de hit + extra damage)");
        System.out.println("3. Experto (15% de hit extra + extra damage)");
        int dificultad = leer.nextInt();                        
        
        int balas = 25;
        int vida = 25;        
        int daño = 0;
        int distancia = 0;
        int distancia2 = 0;
        int distancia3 = 0;
        

        switch (dificultad){
            case 1:                 
                char seguir = 's';
                distancia = random.nextInt (30) + 15;
                distancia3 = distancia;
                System.out.println("La distancia del zombie es de: "+ distancia);
                while (seguir == 's' || seguir == 'S'){
                                       
                    
                    while (vida > 0 && balas > 0 && distancia > 0){
                        System.out.println();
                        System.out.println("El jugador cuenta con: "+ balas +" balas!");
                        double probdaño = random.nextInt(65) + 0;                         
                        distancia2 = random.nextInt(5) + 3;
                        System.out.println("El zombie se encuentra a: "+distancia3+" metros!");
                        
                        if (probdaño > 0){
                            daño = random.nextInt(7) + 1;
                            vida -= daño;
                            balas -= 1;
                            System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: "+ daño +"!");
                            if (vida <= 0){
                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                                vida = 0;
                            }else if (balas <= 0){
                                System.out.println("Ha fallado! El zombie se encuentra a: "+ distancia +" mestros");
                                balas = 0;
                            }else if (distancia <= 0){
                                System.out.println("GAME OVER, la distancia se redujo a 0");
                                distancia = 0;
                            }
                        }else{
                            daño = 0;
                            distancia3 -= distancia2;
                            balas -= 1;
                            if (vida <= 0){
                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                                vida = 0;
                            }else if (balas <= 0){
                                System.out.println("Ha fallado! El zombie se encuentra a: "+ distancia +" mestros");
                                balas = 0;
                            }else if (distancia3 <= 0){
                                System.out.println("GAME OVER, la distancia se redujo a 0");
                                distancia = 0;
                            }
                        }
                        System.out.println();                         
                        
                        System.out.println("Vida restante del zombie: "+ vida);
                        System.out.println();
                        System.out.println("El zombie se encuentra a: "+ distancia +" metros");
                        
                        System.out.println("Listo para seguir avanzando? (S/N)");
                        seguir = leer.next().charAt(0);                                                   
                    }   
                System.out.println();
                System.out.println("Juego Finalizado"); 
                seguir = 'n';
                System.out.println();
                }
                
                System.out.println("Ingrese maestria: ");
                System.out.println("1. Principiante (0% de hit extra + extra damage)");
                System.out.println("2. Intermedio (5% de hit + extra damage)");
                System.out.println("3. Experto (15% de hit extra + extra damage)");
                dificultad = leer.nextInt();
                                              
                break;
                
            case 2:
                seguir = 's';
                distancia = random.nextInt (30) + 15;
                distancia3 = distancia;
                System.out.println("La distancia del zombie es de: "+ distancia);
                while (seguir == 's' || seguir == 'S'){
                                       
                    
                    while (vida > 0 && balas > 0 && distancia > 0){
                        System.out.println();
                        System.out.println("El jugador cuenta con: "+ balas +" balas!");
                        double prob1 = (65 + (65 * 0.5));
                        double probdaño = random.nextDouble(prob1) + 0;                        
                        distancia2 = random.nextInt(5) + 3;
                        System.out.println("El zombie se encuentra a: "+distancia3+" metros!");
                        
                        if (probdaño > 0){
                            daño = random.nextInt(7) + 1;
                            vida -= daño;
                            balas -= 1;
                            System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: "+ daño +"!");
                            if (vida <= 0){
                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                                vida = 0;
                            }else if (balas <= 0){
                                System.out.println("Ha fallado! El zombie se encuentra a: "+ distancia +" mestros");
                                balas = 0;
                            }else if (distancia <= 0){
                                System.out.println("GAME OVER, la distancia se redujo a 0");
                                distancia = 0;
                            }
                        }else{
                            daño = 0;
                            distancia3 -= distancia2;
                            balas -= 1;
                            if (vida <= 0){
                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                                vida = 0;
                            }else if (balas <= 0){
                                System.out.println("Ha fallado! El zombie se encuentra a: "+ distancia +" mestros");
                                balas = 0;
                            }else if (distancia3 <= 0){
                                System.out.println("GAME OVER, la distancia se redujo a 0");
                                distancia = 0;
                            }
                        }
                        System.out.println();                         
                        
                        System.out.println("Vida restante del zombie: "+ vida);
                        System.out.println();
                        System.out.println("El zombie se encuentra a: "+ distancia +" metros");
                        
                        System.out.println("Listo para seguir avanzando? (S/N)");
                        seguir = leer.next().charAt(0);                                                   
                    }   
                System.out.println();
                System.out.println("Juego Finalizado"); 
                seguir = 'n';
                System.out.println();
                }
                
                System.out.println("Ingrese maestria: ");
                System.out.println("1. Principiante (0% de hit extra + extra damage)");
                System.out.println("2. Intermedio (5% de hit + extra damage)");
                System.out.println("3. Experto (15% de hit extra + extra damage)");
                dificultad = leer.nextInt();                
                break; 
                
            case 3: 
                seguir = 's';
                distancia = random.nextInt (30) + 15;
                distancia3 = distancia;
                System.out.println("La distancia del zombie es de: "+ distancia);
                while (seguir == 's' || seguir == 'S'){
                                       
                    
                    while (vida > 0 && balas > 0 && distancia > 0){
                        System.out.println();
                        System.out.println("El jugador cuenta con: "+ balas +" balas!");
                        double prob1 = (65 + (65 * 0.5));
                        double probdaño = random.nextDouble(prob1) + 0;                        
                        distancia2 = random.nextInt(5) + 3;
                        System.out.println("El zombie se encuentra a: "+distancia3+" metros!");
                        
                        if (probdaño > 0){
                            daño = random.nextInt(7) + 1;
                            vida -= daño;
                            balas -= 1;
                            System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: "+ daño +"!");
                            if (vida <= 0){
                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                                vida = 0;
                            }else if (balas <= 0){
                                System.out.println("Ha fallado! El zombie se encuentra a: "+ distancia +" mestros");
                                balas = 0;
                            }else if (distancia <= 0){
                                System.out.println("GAME OVER, la distancia se redujo a 0");
                                distancia = 0;
                            }
                        }else{
                            daño = 0;
                            distancia3 -= distancia2;
                            balas -= 1;
                            if (vida <= 0){
                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                                vida = 0;
                            }else if (balas <= 0){
                                System.out.println("Ha fallado! El zombie se encuentra a: "+ distancia +" mestros");
                                balas = 0;
                            }else if (distancia3 <= 0){
                                System.out.println("GAME OVER, la distancia se redujo a 0");
                                distancia = 0;
                            }
                        }
                        System.out.println();                         
                        
                        System.out.println("Vida restante del zombie: "+ vida);
                        System.out.println();
                        System.out.println("El zombie se encuentra a: "+ distancia +" metros");
                        
                        System.out.println("Listo para seguir avanzando? (S/N)");
                        seguir = leer.next().charAt(0);                                                   
                    }   
                System.out.println();
                System.out.println("Juego Finalizado"); 
                seguir = 'n';
                System.out.println();
                }
                
                System.out.println("Ingrese maestria: ");
                System.out.println("1. Principiante (0% de hit extra + extra damage)");
                System.out.println("2. Intermedio (5% de hit + extra damage)");
                System.out.println("3. Experto (15% de hit extra + extra damage)");
                dificultad = leer.nextInt();
                break;
        }
    }
    
    public static void triangulo(){
        System.out.println("Ingrese un valor mayor a 20 y par: ");
        int tamaño = leer.nextInt();
        int mitad = tamaño/2;
        
        if ((tamaño >= 20) && (tamaño % 2 == 0) && (mitad % 2 == 0)){
            for (int n = 0; n < mitad; n++){
                for (int m = 0; m < tamaño; m++){
                    if (n + m == mitad){
                        System.out.print("* ");
                    }else{
                    System.out.print(" ");
                    }
                    
                }
                System.out.println(" ");
            }
            
        }else{
           System.out.println("Ingrese otro valor: ");
           tamaño = leer.nextInt(); 
        }                
    }
}
