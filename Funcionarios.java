/*a ) Desenvolva o seguinte aplicativo:
- Crie uma superclasse chamada Funcionários, com as seguintes características:
i. Nome;
ii. Endereço;
iii. Telefone.
- Crie uma subclasse chamada Professor, com as seguintes características:
i. Disciplina Ministrada (basta uma);
ii. Valor da hora/aula.
- Crie outra subclasse chamada Administrativo, com as seguintes cartacterísticas:
i. Cargo;
ii. Salário.
- Crie uma classe principal que:
i. Le o nome de um funcionário;
ii. Usa um switch para que escolha entre professor e administrativo;
iii. Le e mostra todos os dados de um funcionário com base na opção escolhida.*/

import java.util.Scanner;
// superclasse
public class Funcionarios {
    protected String nome;
    protected String endereco;
    protected String telefone;

     Scanner sc = new Scanner(System.in);
     public void nome(){
          System.out.println();
     //o this pq e atributo da classe se colocar o string e como o parâmetro do método
          this.nome = sc.nextLine(); 
     }
     public void endereco(){
          System.out.println();
          this.endereco = sc.nextLine();
     }
     public void telefone(){
          System.out.println();
          this.telefone = sc.nextLine();
     }
     
     public void mostrarDados() {
          System.out.println("Nome: " + nome);
          System.out.println("Endereço: " + endereco);
          System.out.println("Telefone: " + telefone);
      }
}