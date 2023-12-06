package atividadeTRYCATCH;

import java.util.*;

public class atividadetrycatch3 {
    public static void main(String[] args) {
        try{
                    Scanner sc = new Scanner(System.in);
                    short minhaVariavel;
                    System.out.println("Digite um número: ");
                    minhaVariavel = sc.nextShort();
                    System.out.println("Seu número é " + minhaVariavel);
                    sc.close();
                }catch (Exception e){
                    System.out.println("Ops! Ocorreu o erro" + e);
                }   
            }
        }

