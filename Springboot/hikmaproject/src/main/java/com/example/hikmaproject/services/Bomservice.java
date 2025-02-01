    package com.example.hikmaproject.services;

    import java.math.BigDecimal;
    import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import com.example.hikmaproject.Models.Bom;
    import com.example.hikmaproject.repositories.BOMRepository;

    @Service
    public class Bomservice {
    @Autowired
    private BOMRepository bomRepository;
    
    
        public List<Bom> getBom() {
            return bomRepository.findAll();
        }
        
        public List<Bom> getCodeProduit(String codeproduit) {
            return bomRepository.findByCodeproduit(codeproduit);
        }
        
        public List<Bom> getLibellesMP(String libellesMP){
            return bomRepository.findByLibellesMP(libellesMP);
        }

        public List<Bom> getUnite(String unite){
            return bomRepository.findByUnite(unite);
        }

        public List<Bom> getTaillelot(BigDecimal taillelot){
            return bomRepository.findBytaillelot(taillelot);
        }
    }
    