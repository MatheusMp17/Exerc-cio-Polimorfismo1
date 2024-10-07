public class PokemonFogo extends Pokemon{
    public PokemonFogo(String nome, String classe, int indicePokedex, float altura, float peso, String regiao, int numeroEvolucoes){
        super(nome, classe, indicePokedex, altura, peso, regiao, numeroEvolucoes);
        setTipo(1);
        setDefesa(determinarStatusBase(10));
        setEvolucaoAtual(1);
        setAtaque(determinarStatusBase(10));
        setVelocidade(determinarStatusBase(10));
        setVidaMax(determinarStatusBase(100) + 50);
        setVida(getVidaMax());
    }
    @Override
    public void atacar(Pokemon alvo, int tipoAtaque) {
        int dano;
        switch (tipoAtaque) {
            case 1:
                dano = (int)(getAtaque() + 10 * (alvo.getDefesa() / 100));
                System.out.println("Labaredas");
                if(testarFraqueza(1, alvo.getTipo())){
                    alvo.sofrerDano(dano * 2);
                }
                else if(testarResistencia(1, alvo.getTipo())){
                    alvo.sofrerDano((int) (dano / 2));
                }
                else{
                        alvo.sofrerDano(dano);
                }
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