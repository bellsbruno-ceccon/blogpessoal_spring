package com.generation.blogpessoal.util;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.generation.blogpessoal.model.UsuarioLogin;

public class JwtHelper {

    private JwtHelper() {
    }

    public static String obterToken(TestRestTemplate testRestTemplate, String email, String senha) {

        UsuarioLogin usuarioLogin = TestBuilder.criarUsuarioLogin(email, senha);

        HttpEntity<UsuarioLogin> requisicao = new HttpEntity<>(usuarioLogin);

        ResponseEntity<UsuarioLogin> resposta = testRestTemplate.exchange(
                "/usuarios/logar",
                HttpMethod.POST,
                requisicao,
                UsuarioLogin.class);

        if (resposta.getBody() != null && resposta.getBody().getToken() != null) {
            return resposta.getBody().getToken();
        }

        throw new RuntimeException("Erro ao obter Token JWT.");
    }

    public static <T> HttpEntity<T> criarRequisicaoComToken(T body, String token) {

        HttpHeaders headers = new HttpHeaders();

        headers.setBearerAuth(token.replace("Bearer ", ""));

        return new HttpEntity<>(body, headers);
    }

    public static HttpEntity<Void> criarRequisicaoComToken(String token) {
        return criarRequisicaoComToken(null, token);
    }

}