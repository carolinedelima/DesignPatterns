public class TesteFactory {

    private static Oculos montarOculos(String tipo) {
        OculosFactory of = null;

        switch (tipo) {
            case "top":
                of = new OculosTop();
                break;
            case "simples":
                of = new OculosSimples();
        }

        Oculos oculos = new Oculos();

        oculos.setArmacao(of.montarArmacao());
        oculos.setLentes(of.montarLentes());

        return oculos;
    }

    public static void main(String[] args) {

        Oculos oculos1 = montarOculos("top");
        Oculos oculos2 = montarOculos("simples");

        System.out.println("END");
    }

}
