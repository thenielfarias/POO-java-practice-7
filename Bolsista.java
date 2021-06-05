package projetofaculdade;
public final class Bolsista extends Aluno {
    private float bolsa;
    
    public final void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " E bolsista! Pagamento facilitado");
    }
    
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }    
}
