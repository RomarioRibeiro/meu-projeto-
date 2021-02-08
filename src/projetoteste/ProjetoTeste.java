package projetoteste;


import java.util.Scanner;

public class ProjetoTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String sim = "SIM ";
        System.out.print("JA E CASTRATADO NO SITE :");
        sim = ler.next();
        while (sim.equals("SIM") |sim.equals("sim")) {
            System.out.println("SEJA BEM VINDO SITE DE CADASTRO");
            ler.nextLine();
            System.out.print("Informe seu Nome :");
            String nome = ler.nextLine();
            System.out.print("infome seu numero de cadastro :");
            int codigo = ler.nextInt();

            System.out.println("DESEJA CONTINUAR");
            sim = ler.next();
            System.out.println(nome +" " +codigo);
            
        }
       
           ler.close();    
    }

}
