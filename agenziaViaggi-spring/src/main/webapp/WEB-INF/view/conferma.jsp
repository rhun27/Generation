<%@page import="agViaggi.entities.Viaggio"%>
<%@page import="agViaggi.entities.Utente"%>
<%@page import="agViaggi.entities.Prenotazione"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Conferma Pagamento</title>
</head>
<body>

	<h1>PAGAMENTO CONFERMATO!</h1>

	<%
		Prenotazione p = (Prenotazione) request.getAttribute("prenotazione");
		Utente u = (Utente) request.getAttribute("utente");
		Viaggio v = (Viaggio) request.getAttribute("viaggio");
	%>

	<p>
		Riepilogo:
		<%=u.toString() %>

		<%=v.toString() %>
	</p>

</body>
</html>