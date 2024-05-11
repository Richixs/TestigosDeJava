public class CalculadoraSistemasNumericos {
    public int convertirSistemaNumericoDecimal(String numero, int base) {
        int numeroDecimal = Integer.parseInt(numero, base);
        return numeroDecimal;
    }
    public String convertirDecimalSistemaNumerico(int numeroDecimal, int base) {
        String numero = Integer.toString(numeroDecimal, base);
        return numero;
    }
}
