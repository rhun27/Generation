var conferma = document.getElementById('acquista');
var cognome = document.getElementById('cognome');
var email = document.getElementById('email');
var nCarta = document.getElementById('nCarta');
var nPasseggeri = document.getElementById('passeggeri');
var nome = document.getElementById('nome');

var viaggio_id = localStorage["id_viaggio"];

conferma.addEventListener('click', function(){
       
    console.log(nome.value);
    console.log(cognome.value);
    console.log(email.value);
    console.log(nCarta.value);
    console.log(nPasseggeri.value);

});