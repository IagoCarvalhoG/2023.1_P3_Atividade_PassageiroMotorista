public class Motorista extends Usuario {
    private double saldo =0;
    public Motorista(String nome, double nota,double posicaoX,double posicaoY){
        super(nome,nota,posicaoX,posicaoY);
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void pagamento(double pagamento){
        this.saldo = saldo + pagamento;
    }

}
