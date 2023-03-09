public class Passageiro extends Usuario {
    private String telefone;
    public Passageiro(String nome, double nota, double posicaoX, double posicaoY,String telefone){
        super(nome,nota,posicaoX,posicaoY);
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
}
