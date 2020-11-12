import java.util.Random;

public class QuickSort{
        public static void main(String[] args) {
            int[] vet = vet();
            System.out.println("-------------------------------------");
            imprime(vet);
            System.out.println();
            quickSort(vet, 0, vet.length - 1);
            System.out.println("-------------------------------------");
            imprime(vet);
        }

        public static void quickSort(int[] vetor, int esquerda, int direita){
            if(esquerda < direita){
                int pivo = particao(vetor, esquerda, direita);
                quickSort(vetor, esquerda, pivo);
                quickSort(vetor, pivo +1, direita);
            }
        }

        public static int particao(int[] vetor, int esquerda, int direita){
            int meio = (int) (esquerda + direita) / 2;
            int pivot = vetor[meio];
            int i = esquerda - 1;
            int j = direita + 1;
            while(true){
                do {
                    i++;
                } while(vetor[i] < pivot);
                
                do {
                    j--;
                } while(vetor[j] > pivot);
                
                if(i >= j){
                    return j;
                }
                
                int aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }

        public static int[] vet(){
        int[] vet = new int[10];
        Random gerador = new Random();
            for(int i = 0; i < vet.length; i++){
                vet[i] = gerador.nextInt(589);
            }
            return vet;
        }

        public static void imprime(int[] vet){
            for(int i = 0; i < vet.length; i++){
                System.out.print(vet[i] + " ");
            }
        }
}