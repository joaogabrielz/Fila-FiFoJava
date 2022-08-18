/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filafifo1;

public class FilaFiFo1 {

     public static void menu(){    
        System.out.println("\n--- Menu ---");
        System.out.println("1 - Inserir na Fila");
        System.out.println("2 - Remover da Fila");
        System.out.println("3 - Imprimir");    
        System.out.println("-1 - Sair\n");
    }
  
    public static void main(String[] args) {
       
        int opcao=0;
        Fila fila = new Fila();
      
         while(opcao != -1){
            menu();
            opcao = Input.readInt("Digite a opcao: ");
            
            switch(opcao){
                case 1 : fila.insere(); break;
                
                case 2 : fila.remove(); break;
                
                case 3 : fila.imprime(); break;
                
                case -1 : System.out.println("\nSaindo...\n"); break;
                
                default : System.out.println("\nOpcao invalida! ");
            }            
        }   
        
    }
    
}
