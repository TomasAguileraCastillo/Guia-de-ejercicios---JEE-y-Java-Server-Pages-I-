<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="cl.desafiolatam.utiles.UtilesGeneral"%>
<%// Incluye clases requeridas 
UtilesGeneral utilesgeneral = new UtilesGeneral();%>

<!doctype html>
<html lang="es">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Proyecto Demo - Desafio Latam</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<h1>Actividad JSP - Academia Desafío Latam</h1>
			<div class="row">
				<div class="col-12 col-sm-12">
					<table class="table">
						<thead>
							<tr >
								<th scope="col">#</th>
								<th scope="col">Número Mes</th>
								<th scope="col">Nombre Mes</th>
								<th style="center" scope="col">Acciones</th>
							</tr>
						</thead>
						<tbody>
							<% for (int x = 0; x < 12; x++) { %>
								<tr>
									<th scope="row"><%=x + 1%></th>									
										<td>Número Mes <%=x + 1%></td>
										<td><%=utilesgeneral.getNombreMes(x)%></td>
										<td>
										<div class ="row row-cols-lg-auto align-items-center">
											<div>
												<a href="ObtenerEfemerides?mes=<%=x%>">Efemérides</a>
											</div>
											<div>
												<a href="ObtieneDiasMes?mes=<%=x%>">dias</a>
											</div>
											<div>
												<a href="ObtieneCantidadFeriadosMes?mes=<%=x%>">Feridos</a>
											</div>
										</div>
										</td>
									</tr>
							<% } %>
						</tbody>
					</table>
				</div>
			</div>
 		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	</body>
</html>  