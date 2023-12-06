package atividadeTRYCATCH;
import java.util.*;
public class trycatch5 {
    public static boolean validarInteger(String erro) {
        boolean retornar= false;
        if(Integer.valueOf(erro)>2147483647){
            throw new InputMismatchException("Ops! Valor inteiro maior que o permitido. Favor digitar um valor menor");
            
        }else if(Integer.valueOf(erro)<=2147483647){
            
           System.out.println("Ok Valor aceito!");
        }else{
             Integer[] numeros ={0,1,2,3,4,5,6,7,8,9};
             boolean achouInteiro = false;
             boolean achouString = false;
           for(int n = 0; n < erro.length();n++);{
            achouInteiro = false;
            for(int i = 0; i < numeros.length; i++){
                if(numeros[i] == Integer.valueOf(erro.charAt(n))){
                    achouInteiro = true;
                }
            } 
            if(achouInteiro == false){
                achouString = true;
            }
           }
           if(achouString == true){
            throw new InputMismatchException("Ops! contém algum caracter não númerico na digitação. FAvor digitar apenas números");
          
           }else{
            System.out.println("Valor aceito pelo sistema, prosseguindo...");
            retornar = true;
           }
        }
        return retornar; 
       
    }
    public static void main(String[] args) {
        try {
            boolean indentificouValor = false;
            Scanner scnValor = new Scanner(System.in);
            while(indentificouValor == false;){System.out.println("Digite um valor");
            int valor = scnValor.nextInt();
            if(validarInteger(String.valueOf(valor)) == true){
                indentificouValor = true;
            }
        }
        scnValor.close();
        
    }catch(Exception e){
        System.out.println("Ops! ocorreu um erro "+e);
    }
}
}
