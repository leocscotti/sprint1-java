package br.com.fiap.jadv.challenge.visionaryai.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.fiap.jadv.challenge.visionaryai.entidades.IA;
@Service
public class IaService {

    @Autowired
    private FonteDeDadosService fonteDeDadosService;

    @Autowired
    private PreverTendenciasService preverTendenciasService;

    public String obterInsights(IA ia) {
        return fonteDeDadosService.obterInsights(ia);
    }

    public String preverTendencias(IA ia) {
        String dadosIA = fonteDeDadosService.obterInsights(ia);
        return preverTendenciasService.preverTendenciasBaseadoNosDados(dadosIA);
    }

    public String configurarFonteDeDados() {
        return fonteDeDadosService.configurarFonteDeDados();
    }
}
