package pucrs.progoo;

public class ProdutoEE extends Produto {
    private int diasGarantia;

    public ProdutoEE(int umCodigo,
                   String umNome,
                   double umPreco,
                   int dias) {
        super(umCodigo, umNome, umPreco);
        diasGarantia = dias;
    }

    @Override
    public double getPreco() {
        // neste exemplo produtos EE possuiem uma sobretaxa de 10%
        return super.getPreco() * 1.10;
    }

    @Override
    public String getNome() {
        return super.getNome() + "(EE)";
    }

    //@Override
   // public String toString() {
   //     return super.toString() + "(EE)";
   // }
}
