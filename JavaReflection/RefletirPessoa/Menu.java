import java.sql.Ref;

public class Menu {

    public static void main(String[] args) {

        RefletirPessoa refletindo = new RefletirPessoa();

        System.out.println("Lista de todos os métodos da Classe refletida: ");
        refletindo.listaNomeDosMetodos();

        System.out.println("\nLista de atributos: ");
        refletindo.atributos();

        System.out.println("\nInvoca Métodos da Classe");
        refletindo.invocaMetodos();

    }
}
