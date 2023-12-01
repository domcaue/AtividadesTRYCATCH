package atividadeTRY.CATCH;
import java.util.*;

public class atividadetrycatch1 {
    public static void main(String[] args) {
        try{
        // Double gravidade = 9.81;
        Scanner scnPeso = new Scanner(System.in);
        Scanner scnAltura = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso = scnPeso.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura= scnAltura.nextDouble();
        System.out.println("Seu IMC (Peso / (Altura*Altura) ("+peso+"/("+altura+"*"+altura+") = "+"["+(peso/(altura*altura))+"]");

        scnPeso.close();

        scnAltura.close();


        }catch(InputMismatchException e ){
            System.out.println("Ops! ocorreu um erro! "+e);
        } 
        

    }
}

