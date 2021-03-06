public class MarioGrande implements SituacaoMarioI{
    @Override
    public void pegarCogumelo(Mario mario) {
        mario.pontuacao += 1000;
    }

    @Override
    public void levarDano(Mario mario) throws Exception {
        mario.setSituacaoMario(new MarioPequeno());
    }

    @Override
    public void pegarFlor(Mario mario) {
        mario.setSituacaoMario(new MarioFogo());
    }

    public String toString(){
        return "1";
    }
}
