public class OculosSimples extends OculosFactory {

    public Armacao montarArmacao() {
        return new ArmacaoAcrilico();
    }

    public Lentes montarLentes() {
        return new LentesNormal();
    }

}
