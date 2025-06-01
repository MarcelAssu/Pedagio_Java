public class Moto implements Veiculo {
    
    @Override
    public double calcularPedagio() {
        return 2.50;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}