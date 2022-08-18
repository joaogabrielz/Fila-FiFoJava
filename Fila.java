/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filafifo1;


public class Fila {
    
   public Pessoa vPessoa[];
   public int qntdPessoa;
   
   public Fila() {
       int tam = Input.readInt("Digite o tamanho maximo da Fila: ");
       vPessoa = new Pessoa[tam];
   }
   
   public void insere(){
       
       if(qntdPessoa < vPessoa.length ){
           vPessoa[qntdPessoa++] = new Pessoa();
           System.out.println("Inserido com sucesso.");
       }
       else{
           System.out.println("Tamanho maximo atingido! ");
       }
   }
   
   public void remove(){
       
       if(qntdPessoa > 0){        
           for (int i = 1; i < qntdPessoa; i++) {              
               vPessoa[i -1] = vPessoa[i];
           }
           qntdPessoa--;
           System.out.println("Removido com sucesso");
       }
       else{
           System.out.println("Fila esta Vazia!");
       }
   }
   
   public void imprime(){
       if(qntdPessoa >0){
          for (int i = 0; i < qntdPessoa; i++) {
          vPessoa[i].imprime();
         }
       }
       else{
           System.out.println("Fila vazia!");
       }
       
   }   
    
}
