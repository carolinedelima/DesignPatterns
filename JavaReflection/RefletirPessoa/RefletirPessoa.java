import java.lang.reflect.*;

public class RefletirPessoa {

    public void listaNomeDosMetodos() {

        try {

            Class cl = Class.forName("Pessoa");
            Method[] metodos = cl.getDeclaredMethods();

            for (int i = 0; i < metodos.length; i++) {

                System.out.println(metodos[i].toString());
            }

        } catch (Throwable e) {

            System.out.println(e);
        }
    }

    public void atributos() {

        try {

            Class cl = Class.forName("Pessoa");
            Method[] metodos = cl.getDeclaredMethods();

            for (int i = 0; i < metodos.length; i++) {

                Method m = metodos[i];
                System.out.println("Nome do Método: " + m.getName());
                System.out.println("Tipo de Retorno: " + m.getReturnType());

            }

        } catch (Throwable e) {

            System.out.println(e);
        }
    }

    public void invocaMetodos() {

        Pessoa pessoa = new Pessoa("Caroline Lima", 24, "123.456.789-90", "12.345.678-9");

        try {

            Class cl = Class.forName("Pessoa");
            Field[] campos = cl.getDeclaredFields();
            Method[] metodos = cl.getDeclaredMethods();

            for (int j = 0; j < metodos.length; j++) {

                System.out.println(campos[j].getName() + " : " + metodos[j].invoke(pessoa));

            }

        } catch (Throwable e) {

            System.out.println(e);
        }

    }
}
