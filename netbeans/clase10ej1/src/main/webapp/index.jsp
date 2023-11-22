<%-- 
    Document   : index
    Created on : 22 nov 2023, 11:24:05
    Author     : Carlos Jaquez
--%>

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
            <h1>Votacion</h1>
            <p>Elija un voto</p>
            <form method="post" action="PartidoSv" >
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="opciones" id="opcionA" value="opcionA">
                    <label class="form-check-label" for="opcionA">Partido A</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="opciones" id="opcionB" value="opcionB">
                    <label class="form-check-label" for="opcionB">Partido B</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="opciones" id="opcionC" value="opcionC">
                    <label class="form-check-label" for="opcionC">Partido C</label>
                </div>
                <div>
                    <button type="submit" class="btn btn-primary">Votar</button>
                </div>
            </form>
            <div>
                <button type="submit" class="btn btn-success">Mostrar resultados</button>
            </div>
        </div>
    </body>
</html>
