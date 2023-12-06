package atividadeTRYCATCH;

import java.util.*;

public class atividadetrycatch4 {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        Long num;
        System.out.println("Informe um número: "  );
        num = sc.nextLong();

        sc.close();

        System.out.println("seu numero é :" + num );
        }catch (Exception e){
            System.out.println("Ops! Ocooreu o erro " + e);
    }
}
}
