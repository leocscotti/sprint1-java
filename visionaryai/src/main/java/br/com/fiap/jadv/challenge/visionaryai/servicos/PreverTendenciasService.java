package br.com.fiap.jadv.challenge.visionaryai.servicos;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.jadv.challenge.visionaryai.entidades.IA;

@Service
public class PreverTendenciasService {

    private FonteDeDadosService fonteDeDados;

    private List<String> resultadosPrevisao = new ArrayList<>();

    public PreverTendenciasService(FonteDeDadosService fonteDeDados) {
        this.fonteDeDados = fonteDeDados;
    }

    public String preverTendencias(IA ia) {
   
        String dadosIA = fonteDeDados.obterInsights(ia);
        String previsao = preverTendenciasBaseadoNosDados(dadosIA);

        armazenarResultadoPrevisao(previsao);
        enviarEmail(previsao);

        return previsao;
    }

    String preverTendenciasBaseadoNosDados(String dadosIA) {
    	String dadosMinusculos = dadosIA.toLowerCase();
        
        
        if (dadosMinusculos.contains("crescimento")) {
            return "Previsão de tendências: Aumento nas vendas esperado para o próximo trimestre.";
        } else {
            return "Previsão de tendências: Estabilidade nas vendas esperada para o próximo trimestre.";
        }}
    
    private void armazenarResultadoPrevisao(String previsao) {
    	resultadosPrevisao.add(previsao);
        System.out.println("Resultado da previsão armazenado: " + previsao);
    }

    private void enviarEmail(String previsao) {
        System.out.println("E-mail enviado com a seguinte mensagem: " + previsao);
    }
}
