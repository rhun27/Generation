const PRENOTAZIONI = document.getElementById("prenotazioni");
const TABELLA = document.getElementById("tabella");
const CORPOTAB = document.getElementById("corpoTab");
const URL = "api/prenotazioni";


fetch(URL).then(j => j.json()).then(prenotazioni => 
{
    for(var p of prenotazioni) {

        var riga = document.createElement('tr');
        var cellaUtente = document.createElement('td');
        var cellaViaggio = document.createElement('td');
        var cellaPrezzo = document.createElement('td');

        cellaUtente.innerHTML = p.utente_id;
        cellaViaggio.innerHTML = p.viaggio_id;
        cellaPrezzo.innerHTML = p.prezzo_totale;

        riga.appendChild(cellaUtente);
        riga.appendChild(cellaViaggio);
        riga.appendChild(cellaPrezzo);

        CORPOTAB.appendChild(riga);
        TABELLA.appendChild(CORPOTAB);
        PRENOTAZIONI.appendChild(TABELLA);

    }

});