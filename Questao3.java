package ProvaWallaceLuna;
import java.util.Random;
import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Random gerador = new Random();
		    
		String Item;
		 int num;
		 int[] vetor = new int[10];
		 
		   System.out.println
		     ("1 - Cadastrar item perdido\n2 - Buscar item\n3 - Sair "); 
		    
		   System.out.println(" Escolha uma opção");
		    num = entrada.nextInt();
		   
		for(int i=0;i<10;i++){
			vetor[i]= entrada.nextInt();
		    switch (num){
		      
		    case 1: System.out.println(" Insira o item perdido: ");
		    Item = entrada.next();
		    System.out.println(" Cadastro do item perdido efetuado com Sucesso!"+gerador.nextInt(999) );
		        break;
		        
		     case 2: System.out.println(" Insira o Item a Buscar: ");
		    CPF = entrada.next();
		    numVoo = entrada.next();
		       System.out.println(" Check-in realizado com sucesso");
		        break;  
		        
		      case 3: System.out.println(" Insira CPF, Numero do vôo");
		    CPF = entrada.next();
		    numVoo = entrada.next();
		       System.out.println(" Voo Cancelado com sucesso");
		        break; 
		        
		        case 4: System.out.println("Sair ");
		        break; 
		        
		      default:
		        System.out.println(" Numero inválido");
		        
		      }
		  }
		    }
		}