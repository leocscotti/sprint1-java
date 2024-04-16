package br.com.fiap.jadv.challenge.visionaryai.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.jadv.challenge.visionaryai.entidades.IA;
import br.com.fiap.jadv.challenge.visionaryai.servicos.IaService;

@RestController
@RequestMapping("/ia")
public class IaApi {

    @Autowired
    private IaService iaService;

    @GetMapping("/insights")
    public String obterInsights(@RequestParam Integer id) {
        IA ia = new IA();
        ia.setId(id);
        return iaService.obterInsights(ia);
    }

    @PostMapping("/prever-tendencias")
    public String preverTendencias(@RequestBody IA ia) {
        return iaService.preverTendencias(ia);
    }

    @GetMapping("/configurar-fonte-de-dados")
    public String configurarFonteDeDados() {
        return iaService.configurarFonteDeDados();
    }
}
