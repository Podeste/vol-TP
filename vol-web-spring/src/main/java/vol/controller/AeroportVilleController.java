package vol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sopra.promo404.vol.dao.IRepositoryAeroport;
import sopra.promo404.vol.dao.IRepositoryAeroportVille;
import sopra.promo404.vol.dao.IRepositoryVille;
import sopra.promo404.vol.model.AeroportVille;

@Controller
@RequestMapping("/aeroportville")
public class AeroportVilleController {

    @Autowired
    private IRepositoryAeroportVille aeroportvilleRepo;
    
    @Autowired
    private IRepositoryAeroport aeroportRepo;
    
    @Autowired
    private IRepositoryVille villeRepo;


    @GetMapping(value = { "", "/list" })
    public String list(Model model) {
        List<AeroportVille> aeroportsvilles = aeroportvilleRepo.findAll();

        model.addAttribute("aeroportvilles", aeroportsvilles);

        return "aeroportville/aeroportsvilles";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("mesAeroportsVilles", new AeroportVille());
        
        model.addAttribute("aeroports", aeroportRepo.findAll());
        
        model.addAttribute("villes", villeRepo.findAll());

        return "aeroportville/aeroportvilleForm";
    }



    @PostMapping("/save")
    public String save(@ModelAttribute("monAeroportVille") AeroportVille aeroportville) {
        
        
        
        aeroportvilleRepo.save(aeroportville);

        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        aeroportvilleRepo.deleteById(id);

        return "forward:../list";
    }

}