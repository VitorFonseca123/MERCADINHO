/*
 2.	Uma fábrica produz e vende vários produtos e para cada um deles tem-se o nome, quantidade produzida e quantidade vendida. Criar um programa que imprima: 
- Para cada produto, nome, quantidade no estoque e uma mensagem se o produto tiver menos de 50 itens no estoque; 
- Ao final o nome e quantidade do produto com maior estoque.
- Para finalizar o usuário deverá digitar 0.

 */
package exerc2;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Exerc2 {
    

    public static void main(String[] args) {
        String nome; 
        int pro = 0;
        int ven = 0;
        int q = 0;
        int parar =0;
        int maior=0;
        int menor =0;
        int inutil=0;
        String maiornome = "";
        String menornome = "";
        do{
          nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
          pro = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade produzida: "));
          ven = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida"));
            q = pro-ven;
            System.out.println("Produto: "+nome);
            System.out.println("Quantidade no estoque: " +q);
            if(q<50){
                JOptionPane.showMessageDialog(null,"CUIDADO O SEU PRODUTO ESTA ACABANDO");
            }
            if(inutil==0){
                maior = q;
                menor = q;
                inutil++;
            }else if (q>maior){
                maior =q;
                maiornome = nome;
                 
            }else if(q<menor){
                menor = q;
                menornome = nome;
            }
            parar = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para parar, ou qualquer número para continuar"));
        
        }while(parar!=0);
        System.out.println("Maior estoque: " +maiornome +". Quantidade: " +maior);
        System.out.println("Menor estoque: " +menornome + ". Quantidade: " +menor);
    }
}
