import java.util.Arrays;
import java.util.List;

public class Main {
    /*
       Dado um array de inteiros,calcule a fracao dos seus elementos que
       sao positivos,negativos e zeros,imprima na tela o valor decimal
       de cada fracao em um nova linha.
    */
    static Double positives=0.0;
    static Double negatives=0.0;
    static Double zeros=0.0;
    public static void main(String[]args){
        Double[]exemplo={-4.0,3.0,-9.0,4.0,1.0};
        List<Double>numeros= Arrays.asList(exemplo);
        numeros.forEach(item->{
            if(item>0){
                positives++;

            }else if(item<0){
                negatives++;
            }else{
                zeros++;
            }
        });
        System.out.println("positivos :"+positives/exemplo.length);
        System.out.println("negativos :"+negatives/exemplo.length);
        if(zeros>0){
            System.out.println("zeros :"+zeros/exemplo.length);
        }else{
            System.out.println("nao e possivel dividir por zero");
        }

    }
}
