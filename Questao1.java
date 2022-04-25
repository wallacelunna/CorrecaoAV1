package ProvaWallaceLuna;
import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {

				int[] vetor = new int[10];
				int aux;
				int maior, menor, posMaior, posMenor;
				
				Scanner entrada = new Scanner(System.in);
				for(int i=0;i<10;i++){
					System.out.printf("\nDigite a %dº nota:",i+1);
					vetor[i]= entrada.nextInt();	
				}
				//Encontar maior valor
				
				maior = vetor[0];
				posMaior = 0;
				for(int i=0;i<10;i++) {
					for(int j=0; j<10; j++) {
							if (vetor[i] > maior) {
								aux = vetor[j];
								maior = vetor[i];
								posMaior = i;
					}
				}
					
			}
				//Encontrar menor valor
				menor = vetor[0];
				posMenor = 0;
				for(int i=0;i<10;i++) {
					for(int j=0; j<10; j++) {
							if (vetor[i] < menor) {
								menor = vetor[i];
								posMenor = i;
					}
				}
			}	
				
				System.out.println(posMaior);
				
				System.out.println(posMenor);		
			
				return;
				}
		}
		