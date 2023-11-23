<%-- 
    Document   : index
    Created on : 22 nov 2023, 11:24:05
    Author     : Carlos Jaquez
--%>

<%@page import="java.util.List"%>
<%@page import="com.mycompany.clase10ej1.logica.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votacion</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <%--
            <div>
                <form method="post" action="PartidoSV" >
                    <div>
                        <button type="submit" class="btn btn-primary">Cargardatos</button>
                    </div>
                </form>
            </div>
            --%>
            <div>
                <h1>Votacion</h1>
                <p>Elija un voto</p>
                <form method="post" action="PartidoSV" >
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="opciones" id="partidoA" value="partidoA" required>
                        <label class="form-check-label" for="partidoA">partido A</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="opciones" id="partidoB" value="partidoB">
                        <label class="form-check-label" for="partidoB">partido B</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="opciones" id="partidoC" value="partidoC">
                        <label class="form-check-label" for="partidoC">partido C</label>
                    </div>

                    <div>
                        <button type="submit" class="btn btn-primary">Votar</button>
                    </div>
                </form>
            </div>
            <div>
                <form method="get" action="PartidoSV" >
                    <button type="submit" class="btn btn-success">Mostrar resultados</button>
                </form>

                <div class="results-table">
                    <% List<Partido> lista = (List<Partido>) request.getAttribute("partidos");
                        if (lista != null) { %>
                    <h1>Votaciones registradas</h1>
                    <h3>Resultados:</h3>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Partido</th>
                                <th>Votos</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Partido partido : lista) {%>
                            <tr>
                                <td><%= partido.getName()%></td>
                                <td><%= partido.getVotos()%></td>
                            </tr>
                            <% } %>
                        </tbody>
                    </table>
                    <% }%>
                </div>
            </div>
        </div>
    </body>
</html>
