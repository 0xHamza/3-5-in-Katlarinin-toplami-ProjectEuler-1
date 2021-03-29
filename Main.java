/*
 * ProjectEuler Problem1 Solutions/Cozumu 
 * https://projecteuler.net/problem=1
 * Dogru Cevap: 233168
 * @author 0xhamza
 */
public class Main {

    public static void main(String[] args) 
    {
        int toplam = 0;
        for (int i = 3; i < 1000; i++) {
            if(i%3 == 0 || i%5 == 0)
            {
                toplam +=i;
            }
        }
        System.out.println("Cevap1: "+toplam);
        
        //IKINCI YOL ILE COZUM
        int toplam2 = (3*(333*334)/2) + (5*(199*200)/2) - (15*(66*67)/2) ;
        System.out.println("Cevap2: "+toplam2);
    }
    
}
