/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasexual;

import java.util.Scanner;
import java.util.Timer;

public class CalculadoraSexual {

    private String si;

    private int calculadoraSexual(){

        Scanner sc = new Scanner(System.in);
        int hot;
        String sex;
        
        System.out.println("Que operación sexual quieres hacer?");
        System.out.println();
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("5.RESTO");
        System.out.println("6.SALIR :'( ");
        System.out.println();
        System.out.println("Selecciona uno GUARR@. Estoy muy caliente: ");
        hot = sc.nextInt();
        System.out.println("------------------------------------");
        
        return hot;
        
    }
    
    private boolean op(){
        int hot = 0;
        int suma, resta, multiplicar, dividir, resto;
        double A, B, C;
        C = 0;
        Scanner sc = new Scanner(System.in);
        
        while(hot != 6){
            hot=this.calculadoraSexual();
        switch(hot){
            case 1:
                System.out.println("ooohhhh...! Suma. Me pone a 100");
                System.out.println("Selecciona un numero guarr@: ");
                A = sc.nextInt();
                System.out.println("Selecciona otro numero, estoy muy caliente: ");
                B = sc.nextInt();
                
                C = A + B;
                
                if(C == 69){
                    System.out.println("mmmmm... Mi postura preferida"
                    + " el " + C +". Me da ganas de chuparte y tu me la chupas." 
                            + " Follaremos como monas.");
                    sc.next();
                } else {
                    System.out.println("Ufff... Ha salido el " + C + " vaya numero."
                    + " Me pone muchisimo.");
                    sc.next();
                }
                
                break;
                
            case 2:
                
                System.out.println("ooohhhh...! Resta. Te gusta mucho el"
                        + " BDSM.");
                sc.next();
                System.out.println("Selecciona un numero sumis@: ");
                A = sc.nextInt();
                System.out.println("Selecciona otro numero, estoy muy caliente." 
                        + " Me da ganas de echarte cera caliente en tu cuerpo: ");
                B = sc.nextInt();
                
                C = A - B;
                
                if(C == 69){
                    System.out.println("mmmmm... Un buen "+ C +
                            ". Te voy a colgarte atado en la pared y nos hacemos" 
                            + " PUT@.");
                    sc.next();
                } else {
                    System.out.println("Te voy a darte " + C + " latigazos "
                            + "en tu cuerpo, y te gustara.");
                    sc.next();
                }
                
                break;
                
            case 3:    
                System.out.println("ooohhhh...! multiplicacion"
                    + " te guusta hacer flotes.");
                sc.next();
                System.out.println("Selecciona un numero guarr@: ");
                A = sc.nextInt();
                System.out.println("Selecciona otro numero, estoy muy caliente: ");
                B = sc.nextInt();
                
                C = A * B;
                
                if(C == 69){
                    System.out.println("mmmmm... Mi postura preferida"
                    + " el " + C +". Hagamos un buen " + C + " y hagamos "
                            + "pajas mientras chupamos con esta buena postura.");
                    sc.next();
                } else {
                    System.out.println("Ufff... Ha salido el " + C + ". CORRAMONOS MIIENTRAS "
                            + "FLOTEMOS DESNUDADAMENTE (Por obligacion :v).");
                    sc.next();
                }
                
                break;
            case 4:
                System.out.println("ufff...! Dividir, hagamos una buena orgia");
                sc.next();
                System.out.println("Selecciona un numero guarr@: ");
                A = sc.nextInt();
                System.out.println("Selecciona otro numero y quitate la ropa. "
                        + "Porque yo y los invitados estamos desnudos: ");
                B = sc.nextInt();
                
                C = A / B;
                
                if(C == 69){
                    System.out.println("mmmmm... Mi postura preferida"
                    + " el " + C +". Hagamos un buen circulo.");
                    sc.next();
                } else if(C == 3){
                    System.out.println(C + " Te gusta mucho los trios ¬w¬");
                    sc.next();
                } else {
                    System.out.println("Ufff... Ha salido el " + C + ". Igual"
                            + " que el numero de invitados que tenemos");
                    sc.next();
                }
                
                break;
                
            case 5:
                System.out.println("ooohhhh...! Resto. Hagamonos unas buenas pajas"
                        + " en la cama totalmente desnud@s y nos besamos mientras"
                        + " toquemos nuestras cosas.");
                sc.next();
                System.out.println("Selecciona un numero guarr@: ");
                A = sc.nextInt();
                System.out.println("Selecciona otro numero, estoy muy caliente: ");
                B = sc.nextInt();
                
                C = A % B;
                
                if(C == 69){
                    System.out.println("Mmmmm... Ha salido el " + C +
                            ". Te apetece hacer?");
                    String sex = sc.nextLine();
                    
                    if(sex == si){
                        System.out.println("AAAAAAAhhh.... SIIIIII! A CHUPAR!!!!!");
                        sc.next();
                    }else{
                        System.out.println("Auhhh... :(");
                    }
                    
                } else {
                    System.out.println("Ufff... Ha salido el " + C + ". NOS "
                            + "ESTAMOS CORRIENDO!");
                    sc.next();
                }
                
                break;
                
            case 6:
                
                System.out.println("Adios cosa caliente. Quedaremos para "
                     +" juguetear en el proximo dia");
                sc.next();
                break;
            case 69: 
                String sex;
                System.out.println();
                System.out.println("mmmmmm.... Que rico es chupar. Me gusta chupar");
                sc.next();
                System.out.println("Quieres que hagamos un 69. Guarrill@");
                sex = sc.nextLine();
                    if(sex == si){
                        System.out.println("Quitate la ropa, que hacemos una chupadita sexual");
                        sc.next();
                    }else{
                        System.out.println("CAMA, CAMA, TU YO, CAMA, CAMA, CAMA.");
                        sc.next();
                    }
                break;
            
            default:
                System.out.println("Que te estas tocando? ¬w¬");
                sc.next();
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        CalculadoraSexual sex = new CalculadoraSexual();
        
        System.out.println("Bienvenidos a la calculadora Sexual. Estoy muy cachondo.");
        sex.op();
    }
    
}

