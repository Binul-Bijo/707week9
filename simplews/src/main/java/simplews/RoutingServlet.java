package simplews;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class RoutingServlet {

	@GetMapping("/login")
	public String loginView() {
	    return "view-login";
	}

	@PostMapping("/login")
	public RedirectView login(
	        HttpServletRequest request,
	        RedirectAttributes redirectAttributes) {

	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    System.out.println("Login attempt: " + username);

	    redirectAttributes.addFlashAttribute(
	            "message",
	            LoginService.login(username, password)
	    );

	    return new RedirectView("/login", true);
	}
	
	/*
	 * Other GET/POST methods for different routing, such as /isodd
	 */
}
