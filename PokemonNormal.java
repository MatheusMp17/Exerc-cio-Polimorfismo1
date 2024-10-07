public class PokemonNormal extends Pokemon {
    public PokemonNormal(String nome, String classe, int indicePokedex, float altura, float peso, String regiao, int numeroEvolucoes){
        super(nome, classe, indicePokedex, altura, peso, regiao, numeroEvolucoes);
        setTipo(0);
        setDefesa(determinarStatusBase(10));
        setEvolucaoAtual(1);
        setAtaque(determinarStatusBase(10));
        setVelocidade(determinarStatusBase(10));
        setVidaMax(determinarStatusBase(100) + 50);
        setVida(getVidaMax());
    }
    
    @Override
    public void atacar(Pokemon alvo, int tipoAtaque) {
        switch (tipoAtaque) {
            case 1:
                System.out.println("Garra");
                alvo.sofrerDano((int)(getAtaque() + 10 * (alvo.getDefesa() / 100)) );
                break;
            case 2:
            System.out.println("chute");
            alvo.sofrerDano((int)(getAtaque() + 20 * (alvo.getDefesa() / 100)) );
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
