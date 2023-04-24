import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.owasp.encoder.Encode;

@RestController
@RequestMapping("CWE79")
public class CWE79 {

  @GetMapping("bad1")
  void bad1(HttpServletRequest request, HttpServletResponse response) {
    String name = request.getParameter("name");
    try {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.write("<br><br>Unsafe unquoted attribute with bad sanitizer:<br>");
      out.write("<button value=" + name + ">Unsafe unquoted attribute with bad sanitizer</button>");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
