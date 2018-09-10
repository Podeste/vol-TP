package vol.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sopra.promo404.vol.dao.IRepositoryVol;
import sopra.promo404.vol.model.Vol;


@Controller
@RequestMapping("/vol")
public class VolController {

	@Autowired
	private IRepositoryVol volRepo;
	
	@GetMapping(value = { "", "/list" })
	public String list(Model model) {
		List<Vol> vols = volRepo.findAll();

		model.addAttribute("vols", vols);

		return "vol/vols";
	}

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("monVol", new Vol());

		return "vol/volForm";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Optional<Vol> vol = volRepo.findById(id);

		if (vol.isPresent()) {
			model.addAttribute("monVol", vol.get());
		} else {
			model.addAttribute("monVol", new Vol());
		}

		return "vol/volForm";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("monVol") Vol vol) {

		volRepo.save(vol);

		return "redirect:list";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		volRepo.deleteById(id);

		return "forward:../list";
	}

}

