public class Carro implements Veiculo {
    
    @Override
    public double calcularPedagio() {
        return 5.00;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}