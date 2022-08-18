/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FilaPessoas;

import java.util.Scanner;


public class FilaDePessoas {


public static void menu(){
   System.out.println("1- Inserir pessoas na fila de atendimento: ");
   System.out.println("2- Remover da fila de atendimento: ");
   System.out.println("3- Retornar numero de pessoas na fila de atendimento det momento: ");
   System.out.println("4- Imprimir nome das pessoas na fila de atendimento: ");
   System.out.println("5- Sair: ");
}

public static String[] removeNome(String fila[]){
    
    String filaNova[] = new String[fila.length -1];
    
    for(int i = 0; i < fila.length; i++){
        
        if(i + 1 < fila.length){
           filaNova[i] = fila[i+1];
        }
       
    }
    
    return filaNova;
}

public static int[] removePos(int fila[]){
    
    int filaNova[] = new int[fila.length -1];
    
    for(int i = 0; i < fila.length; i++){
        
        if(i + 1 < fila.length){
           filaNova[i] = fila[i+1];
        }
       
    }
    
    return filaNova;
}
 
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);

   int opt = 1;
   
   System.out.println("Digite tamanho maximo da fila? ");
   int qntd = scan.nextInt();
   
   int qntdfilaAtendimento[] = new int[qntd];
   String pessoasFilaAtendimento[] = new String[qntd];
   String dataInsercaoFila[] = new String[qntd];
   
   int x = 0;

do{

   menu();
   opt = scan.nextInt();

   switch(opt){
      case 1:
                      
          if(x < qntd){
               qntdfilaAtendimento[x] = 1;

              System.out.print("Nome: ");
              pessoasFilaAtendimento[x] = scan.next();

              System.out.print("Data: ");
              dataInsercaoFila[x] = scan.next();
              
              System.out.println("- ["+pessoasFilaAtendimento[x] + "] Foi Inserido na fila");
              System.out.println("");
     
             x++;
          }
          else{
              System.out.println("");
              System.out.println("[Erro] - Qntd Maxima atingida!");
              System.out.println("");
          }
  
          
       
      break;
      case 2:
             
          if(qntdfilaAtendimento.length > 0){
            System.out.println("1 Pessoa Removida daFila .. ");
            
            qntdfilaAtendimento = removePos(qntdfilaAtendimento);       
            pessoasFilaAtendimento = removeNome(pessoasFilaAtendimento);  
            dataInsercaoFila = removeNome(dataInsercaoFila);

            System.out.println("Pessoas na fila: " + qntdfilaAtendimento.length);
          }
          else{
              System.out.println("");
              System.out.println("Não ha Ninguem na Fila...");
              System.out.println("");
          }
            
      break;
      case 3:
            System.out.println("");
            System.out.println("Qual data?: ");
            String data = scan.next();
            boolean achou = false;
            
            for (int i = 0; i < qntdfilaAtendimento.length; i++) {
            if(data.equals(dataInsercaoFila[i])){
                if(qntdfilaAtendimento[i] == 1){
              
                    System.out.println("------------------------------------");
                    System.out.println("nome: "+ pessoasFilaAtendimento[i]);
                    System.out.println("Inserido na data: "+ dataInsercaoFila[i]);
                    System.out.println("");
                    achou = true;
                  }
              }
           }
            if(!achou){
                System.out.println("");
                System.out.println("Data ou Usuario Não encontrado!");
                System.out.println("");
            }
          
      break;
      case 4:
          
          if(qntdfilaAtendimento.length > 0){
              System.out.println("");
          System.out.println("Pessoas na fila de atendimento: ");
          for (int i = 0; i < pessoasFilaAtendimento.length; i++) {
             if(pessoasFilaAtendimento[i] != ""){
                System.out.println((i+1) + " -nome: " + pessoasFilaAtendimento[i]);
            }   
            }
          }
          else{
              System.out.println("");
              System.out.println("Não há pessoas na fila..");
          }
          System.out.println(" ");
      break;
      case 5:
      System.out.println("");
      System.out.println("Saindo...");
      break;
      default:
      System.out.println("");
      System.out.println("Opcao invalida...");
      break;
       
    }
  }while(opt != 5);
  }
}
