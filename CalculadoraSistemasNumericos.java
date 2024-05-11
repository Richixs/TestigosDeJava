public class CalculadoraSistemasNumericos {
    public String suma(String numeroA, String numeroB, int base) {
        int resultadoDecimal = convertirSistemaNumericoDecimal(numeroA, base) + convertirSistemaNumericoDecimal(numeroB, base);
        String resultado = convertirDecimalSistemaNumerico(resultadoDecimal, base);
        return resultado;
    }
    public int convertirSistemaNumericoDecimal(String numero, int base) {
        int numeroDecimal = Integer.parseInt(numero, base);
        return numeroDecimal;
    }
    public String convertirDecimalSistemaNumerico(int numeroDecimal, int base) {
        String numero = Integer.toString(numeroDecimal, base);
        return numero;
    }
}
