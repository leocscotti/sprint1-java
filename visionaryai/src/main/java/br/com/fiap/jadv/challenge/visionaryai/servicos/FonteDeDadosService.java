package br.com.fiap.jadv.challenge.visionaryai.servicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.jadv.challenge.visionaryai.entidades.IA;
import br.com.fiap.jadv.challenge.visionaryai.repositorios.IaRepository;

@Service
public class FonteDeDadosService {

    @Autowired
    private IaRepository repository;

    @Transactional
    public String obterInsights(IA ia) {
    	Optional<IA> iaEncontrada = repository.findById(ia.getId());

        
        if (iaEncontrada != null) {
            return "Insights gerados pela IA: " + iaEncontrada;
        } else {
            return "IA não encontrada";
        }
    }

    public String configurarFonteDeDados() {
        StringBuilder formattedData = new StringBuilder();
        formattedData.append("Dados das IA na fonte de dados:\n"); 
        
        Iterable<IA> ias = repository.findAll();
        
        for (IA ia : ias) {
            formattedData.append("ID: ").append(ia.getId())
                         .append(", Tipo: ").append(ia.getTipo())
                         .append(", Descrição: ").append(ia.getDescricao())
                         .append("\n");
        }
        
        return formattedData.toString();
    }

}



