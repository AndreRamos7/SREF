package logicas;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgendaView implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		System.out.println("Executando a logica e redirecionando...");
                String id = req.getParameter("id");
                
                String nomeArq = "conteudos/agendaview.jsp";
                req.setAttribute("nomearq", nomeArq);
            return "home.jsp";
	}

}
