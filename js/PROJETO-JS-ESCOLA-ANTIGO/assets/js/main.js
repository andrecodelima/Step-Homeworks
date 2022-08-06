function exibeselect() {
    let select = document.getElementById('form-select')
    select.style.display = 'block'
  }
  function ocultaselect() {
    let select = document.getElementById('form-select')
    select.style.display = 'none'
  }

  function openNav() {
    document.getElementById("mySidebar").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
  }

  function closeNav() {
    document.getElementById("mySidebar").style.width = "0";
    document.getElementById("main").style.marginLeft = "0";
  }