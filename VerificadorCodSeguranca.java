public class VerificadorCodSeguranca {
    private int codSeguranca = 1234;

    public int getCodSeguranca() { return codSeguranca; }

    public boolean codCorreto(int codSeguranca) {
        return this.codSeguranca == codSeguranca;
    }
}
