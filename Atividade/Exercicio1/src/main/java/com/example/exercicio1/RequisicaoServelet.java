package com.example.exercicio1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet("/requisicao")
public class RequisicaoServelet extends HttpServlet {

    // Atalho Ctrl+Alt+V
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        String method = req.getMethod();
        out.println(method);
        String requestUri = req.getRequestURI();
        String protocol = req.getProtocol();
        String remoteAddr = req.getRemoteAddr();


        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h3>Método: " + method + "</h3>");
        out.println("<h3>URI do Pedido: " + requestUri + "</h3>");
        out.println("<h3>Protocolo: " + protocol + "</h3>");
        out.println("<h3>Endereço remoto: " + remoteAddr + "</h3>");
        out.println("</body></html>");
    }
}