/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.clase10ej1.servlets;

import com.mycompany.clase10ej1.logica.Partido;
import com.mycompany.clase10ej1.persistencia.ControladoraPersistencia;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Jaquez
 */
@WebServlet(name = "PartidoSV", urlPatterns = {"/PartidoSV"})
public class PartidoSV extends HttpServlet {

    private final String INDEXJSP = "index.jsp";
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PartidoSV</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PartidoSV at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Partido> lista = controlPersistencia.listarPartido();

        request.setAttribute("partidos", lista);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher(INDEXJSP).forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String voto = request.getParameter("opciones");
        Partido p = new Partido();
        int votos = 0;

        switch (voto) {
            case "partidoA":
                p = controlPersistencia.buscarPartidoById(1);
                break;
            case "partidoB":
                p = controlPersistencia.buscarPartidoById(2);
                break;
            case "partidoC":
                p = controlPersistencia.buscarPartidoById(3);
                break;
            default:
                throw new AssertionError();
        }

        votos = p.getVotos();
        p.setVotos(++votos);
        controlPersistencia.editarPartido(p);

        /*Partido partidoA = new Partido();
        partidoA.setName("Partido A");
        partidoA.setVotos(0);
        controlPersistencia.crearPartido(partidoA);

        Partido partidoB = new Partido();
        partidoB.setName("Partido B");
        partidoB.setVotos(0);
        controlPersistencia.crearPartido(partidoB);

        Partido partidoC = new Partido();
        partidoC.setName("Partido C");
        partidoC.setVotos(0);
        controlPersistencia.crearPartido(partidoC);
         */
        response.sendRedirect(INDEXJSP);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
