public class Caminhao implements Veiculo {
    
    private int eixos;

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public double calcularPedagio() {
        return 10.00 + (2.00 * eixos);
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}