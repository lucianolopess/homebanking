package br.jus.trt3.curso.aula2.homebanking;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * ClientCoafService
 */
public class ClientCoafService {

    public void notificarMovimentacaoAlta(MovimentacaoAlta movimentacaoAlta) throws IOException, InterruptedException {
       
        // Criando o HttpClient
        HttpClient client = HttpClient.newHttpClient();

        /*

            private final Conta conta;
                private Cliente cliente;
                private final Long id;

            private final LocalDateTime data;
            private final BigDecimal valor;

        */

        // String no formato Json que irá conter o corpo da requisição POST
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
            .append("{")
            .append("movimentos: [")
            .append("{")
            .append("\"idConta\":")
            .append(movimentacaoAlta.getConta().getId())
            .append(",")
            .append("\"nomeCliente\":")
            .append(movimentacaoAlta.getConta().getCliente().getNome())
            .append("}")
            .append("]")
            .append("}");
        String body = stringBuilder.toString(); // movimentacaoAlta

        //Criando um HttpRequest do tipo Post, especificando sua URI e atribuindo ao método Post o corpo da requisição
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .uri(URI.create("https://localhost:3000/movimentos")).build();

        // Enviando a requisição e recebendo o Objeto de resposta da mesma.
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Extraindo status de resposta da requisição Post
        int statusCode = response.statusCode();

        // Imprimindo resultado no console
        System.out.println(String.format("Status code: %s", statusCode));

    }

}