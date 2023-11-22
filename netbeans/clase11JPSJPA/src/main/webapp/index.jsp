<%-- 
    Document   : index
    Created on : 22 nov 2023, 18:21:54
    Author     : Carlos Jaquez
--%>

<%@page import="com.mycompany.clase11jpsjpa.logica.Partido"%>
<%@page import="com.mycompany.clase11jpsjpa.logica.Equipo"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4">
            <h2>Formulario nuevo equipo</h2>
            <form action="SvEquipo" method="post">
                <div class="form-group">
                    <label for="nombreequipo">Nombre:</label>
                    <input type="text" class="form-control" id="nombreequipo" name="nombreequipo">
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>

            <hr>

            <h2>Consultar partidos</h2>
            <form action="SvEquipo" method="get">
                <button type="submit" class="btn btn-primary">Mostrar equipos</button>
            </form>
            <div class="results-table">
                <% if (request.getAttribute("equipos") != null) {%>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : (List<Equipo>) request.getAttribute("equipos")) {%>
                        <tr>
                            <td><%= equipo.getId()%></td>
                            <td><%= equipo.getNombre()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% } else {%>
                <p>No hay resultados</p>
                <%}%>
            </div>            

            <hr>

            <h2>Formulario nuevo partido</h2>
            <form action="SvPartido" method="post">
                <div class="form-group">
                    <label for="codigopartido">Codigo: </label>
                    <input type="text" class="form-control" id="codigopartido" name="codigopartido">
                </div>
                <div class="form-group">
                    <label for="fechapartido">Fecha: </label>
                    <input type="text" class="form-control" id="fechapartido" name="fechapartido">
                </div>
                <div class="form-group">
                    <label for="resultadopartido">Resultado: </label>
                    <input type="text" class="form-control" id="resultadopartido" name="resultadopartido">
                </div>
                <div class="form-group">
                    <label for="equipolocal">Equipo local: </label>
                    <input type="text" class="form-control" id="equipolocal" name="equipolocal">
                </div>
                <div class="form-group">
                    <label for="equipovisitante">Equipo visitante: </label>
                    <input type="text" class="form-control" id="equipovisitante" name="equipovisitante">
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>

            <hr>

            <h2>Consultar partidos</h2>
            <form action="SvPartido" method="get">
                <button type="submit" class="btn btn-primary">Mostrar partidos</button>
            </form>
            <div class="results-table">
                <% if (request.getAttribute("partidos") != null) {%>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Codigo</th>
                            <th>Fecha</th>
                            <th>Resultado</th>
                            <th>Local</th>
                            <th>Visitante</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) {%>
                        <tr>
                            <td><%= partido.getId()%></td>
                            <td><%= partido.getCodigo()%></td>
                            <td><%= partido.getFecha()%></td>
                            <td><%= partido.getResultado()%></td>
                            <td><%= partido.getEquipo_local().getNombre()%></td>
                            <td><%= partido.getEquipo_visitante().getNombre()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% } else {%>
                <p>No hay resultados</p>
                <%}%>
            </div>            
            <br>
            <br>
            <!-- Resultados en tabla -->

        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
