package agViaggi.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import agViaggi.entities.Viaggio;
import agViaggi.service.ViaggioService;

@RestController
@RequestMapping("/api/viaggi")
public class ViaggioREST {
	
	@Autowired
	ViaggioService vs;
	
	@GetMapping("")
	public List<Viaggio> trovaViaggi() {
		return vs.trovaTutti();
	}
	
//	@GetMapping("/pagamento")
//	public ModelAndView pagamento() {
//		return new ModelAndView("payment");
//	}
	
	@GetMapping("/uno")
	public Viaggio trovaUnViaggio(@RequestParam int id) {
		System.out.println(id);
		return vs.trovaUno(id);
	}

}