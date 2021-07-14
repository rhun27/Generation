const VIAGGI = document.getElementById("viaggi");
const FORM = document.getElementById("form");
const DETTAGLIO = document.getElementById("dettaglio");
const URL = "api/viaggi";


fetch(URL).then(j => j.json()).then(viaggi => 
{
    for(var viaggio of viaggi){
        
        var id = viaggio.id;
        var trip = document.createElement('div');
        var testo = document.createElement('div');
        var h2 = document.createElement('h2');
        var p = document.createElement('p');
        let btn = document.createElement('button');
        btn.setAttribute('id', viaggio.id);
        var img = document.createElement('img');
        
        
        btn.onclick = function(){
            localStorage["id_viaggio"] = parseInt(btn.getAttribute('id'));
            window.location.href="/pagamento.html/";
        };

        h2.innerHTML = viaggio.destinazione + ' - ' + viaggio.durata + ' - ' + viaggio.id;
        p.innerHTML = "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Neque fuga vel totam aut consectetur rem inventore.";
        btn.innerHTML = "Prenota";
        img.setAttribute('src', 'https://source.unsplash.com/400x300/?trip');

        trip.setAttribute('class', 'row row-cols-2');
        
        testo.appendChild(h2);
        testo.appendChild(p);

        trip.appendChild(testo);
        trip.appendChild(img);
        trip.appendChild(btn);

        VIAGGI.appendChild(trip);

    }

});