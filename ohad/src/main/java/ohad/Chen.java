package ohad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Chen {
	
	@RequestMapping("/kaki.com")
	public String chen() {
		return "KAKI KAKI HUBEZA KAKI";
	}

}
