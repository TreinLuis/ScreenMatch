package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String s) {
        this.mensagem = s;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
