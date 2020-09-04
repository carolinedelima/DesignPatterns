public class OculosTop extends OculosFactory {

    public Armacao montarArmacao() {
        return new ArmacaoMetal();
    }

    public Lentes montarLentes() {
        return new LentesUV();
    }
}
