import java.util.HashMap;
import java.util.Map;

public class ExHashMap {

    public static void main (String args[]){

        Map<String, String> example = new HashMap<String, String>();

        // Adicionando valores a lista

        example.put( "K1", "V1");
        example.put( "K2", "V2");
        example.put( "K3", "V3");
        example.put( "K4", "V4");
        example.put( "K5", "V5");
        example.put( "K6", "V6");
        example.put( "K7", "V7");
        example.put("K8", "V8");
        example.put( "K9", "V9");
        example.put( "K10", "V10");
        example.put("K11", "V11");
        example.put( "K12", "V12");

        // containsKey

        String keyToSearch = "K1";

        if ( example.containsKey( keyToSearch ) ) {
            System.out.println("Valor da Chave " + keyToSearch + " = " + example.get(keyToSearch));
        }else{
            System.err.println("Chave não existe");
        }

        // Foreach com HashMap

        /*
         * O método "keySet()" retorna um Set com todas as chaves do
         * nosso HashMap, e tendo o Set com todas as Chaves,
         * podemos facilmente pegar
         * os valores que desejamos
         * */

        for (String key : example.keySet()) {

            //Capturamos o valor a partir da chave
            String value = example.get(key);
            System.out.println(key + " = " + value);
        }

    }
}
