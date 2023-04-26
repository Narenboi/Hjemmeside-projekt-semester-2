// Opdaterer aktivt link i menubaren baseret på den aktuelle sektion
function opdaterAktivtLink() {
    var sektioner = document.getElementsByTagName("section");
    for (var i = 0; i < sektioner.length; i++) {
      var sektion = sektioner[i];
      var sektionTop = sektion.offsetTop;
      var sektionHoje = sektion.offsetHeight;
      if (window.pageYOffset >= sektionTop && window.pageYOffset < sektionTop + sektionHoje) {
        var sektionId = sektion.getAttribute("id");
        var links = document.querySelectorAll("nav ul li a");
        for (var j = 0; j < links.length; j++) {
          var link = links[j];
          if (link.getAttribute("href") === "#" + sektionId) {
            link.classList.add("aktiv");
          } else {
            link.classList.remove("aktiv");
          }
        }
      } 
    }
  }
  
  document.getElementById("profil-form").addEventListener("submit", function(event) {
      event.preventDefault();
  
      var navn = document.getElementById("navn").value;
      var email = document.getElementById("email").value;
  
      localStorage.setItem("navn", navn);
      localStorage.setItem("email", email);
  });
  
  document.getElementById("kaeledyr-form").addEventListener("submit", function(event) {
      event.preventDefault();
  
      var kaeledyrNavn = document.getElementById("kaeledyr-navn").value;
  
      var kaeledyrListe = document.getElementById("kaeledyr-liste");
      var nyKaeledyr = document.createElement("li");
      nyKaeledyr.textContent = kaeledyrNavn;
      kaeledyrListe.appendChild(nyKaeledyr);
  });
  
  window.addEventListener("scroll", function() {
    opdaterAktivtLink();
  });
  
  window.addEventListener("resize", function() {
    opdaterAktivtLink();
  });
  
  // Opdaterer aktivt link i menubaren baseret på den aktuelle sektion
function opdaterAktivtLink() {
    // ... (eksisterende kode for at opdatere aktivt link)
}

document.getElementById("profil-form").addEventListener("submit", function(event) {
    // ... (eksisterende kode for at gemme profilform data)
});

document.getElementById("kaeledyr-form").addEventListener("submit", function(event) {
    // ... (eksisterende kode for at gemme kæledyrsform data)
});

window.addEventListener("scroll", function() {
    // ... (eksisterende kode for at opdatere aktivt link ved scroll)
});

window.addEventListener("resize", function() {
    // ... (eksisterende kode for at opdatere aktivt link ved resize)
});

// Lytter efter klik på "Min Profil" linket
document.getElementById("profil-link").addEventListener("click", function(event) {
    // Fjerner "aktiv" klasse fra alle links
    var links = document.querySelectorAll("nav ul li a");
    for (var i = 0; i < links.length; i++) {
        links[i].classList.remove("aktiv");
    }

    // Tilføjer "aktiv" klasse til det klikkede link
    this.classList.add("aktiv");
});
