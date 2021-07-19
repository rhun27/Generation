<%@page import="agViaggi.entities.Viaggio"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="dettaglio">
		<div id="testo">
			<%
			Viaggio v = (Viaggio) request.getAttribute("viaggio");
			%>
			<h1>
			Destinazione:
				<%=v.getDestinazione()%>
			</h1>
			Prezzo:
			<p id="persona">
				<%=v.getPrezzoPersona()%>
			</p>
			Durata:
			<p>
				<%=v.getDurata()%>
			</p>
		</div>

	</div>

	<div id="formContainer">
		<form action="/mvc/aggiungi" method="POST" id="form" name="mioForm">
			<input type="text" name="nome" id="nome" placeholder="inserisci nome">
			<input type="text" name="cognome" id="cognome" placeholder="inserisci cognome">
			<input type="email" name="email" id="email" placeholder="inserisci email">
			<select name="" id="carta">
				<option value="-1">-</option>
				<option value="visa">VISA</option>
				<option value="master">MASTERCARD</option>
				<option value="american">AMERICAN EXPRESS</option>
			</select>
			<input type="text" name="nCarta" id="nCarta" placeholder="inserisci numero carta">
			<input type="number" min="1" value="1" name="passeggeri" id="passeggeri" placeholder="numero passeggeri">
			<!--<label for="prezzoTotale"> Prezzo Totale </label>  -->
			<input type="submit" id="acquista" value="Acquista">
			<input type="hidden" name="idViaggio" value="<%=v.getId() %>">
		</form>
		<button id="btnExit">Esci</button>
		<p id="prezzoTot"></p>

	</div>


	
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
<script type="text/javascript">
	var prezzoTot = document.getElementById('prezzoTot'); 
	var passeggeri = document.getElementById('passeggeri'); 
	var prezzoPersona = document.getElementById('persona');
	
	//imposto prezzo totale con un passeggero
	prezzoTot.innerHTML = parseInt(passeggeri.value) * parseInt(prezzoPersona.innerText);
	
	passeggeri.addEventListener('change', controlla, false);

	function controlla() {
		//quando il n passeggeri cambia aggiorno il campo prezzo tot
		prezzoTot.innerHTML = Number(passeggeri.value) * Number(prezzoPersona.innerText);
	}

	$('#btnExit').on('click', function() {
		window.location.href="/uscita.html";
	});
	
</script>
</body>
</html>