public class Passageiro extends Usuario {
    private String telefone;
    public Passageiro(String nome, double nota,String telefone){
        super(nome,nota);
        this.telefone = telefone;
    }
    public void solicitarCorrida(){
        System.out.println("Corrida solicitada por " + this.nome);
        System.out.println("Nota: " + this.nota);
        System.out.println("Corrida no valor de " + super.distanciaAteDestino * 10);
    }
    public String getTelefone(){
        return this.telefone;
    }
}
