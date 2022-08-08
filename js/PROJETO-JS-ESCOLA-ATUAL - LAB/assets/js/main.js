// SIDEBAR
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



// LOGIN
class cadastroLogin{
  constructor(pUser, pSenha){
      this.usuario = pUser
      this.senha  = pSenha
  }
}

var usuario = document.getElementById('InputUser')
var senha = document.getElementById('InputSenha')

var bancoSenhas = []

function cadastrar(){
  bancoSenhas.push(new cadastroLogin(usuario.value, senha.value))
  alert('Usuário Cadastrado com sucesso!')
  // if(usuario.value == usuario.value){
  //     alert('Já existe um usuário com esse nome. Escolha outro.')
  // }
  alert()
  console.log(bancoSenhas)

}

function login(){
  if (usuario.value == "jw" && senha.value == "jw") {
      alert("Seja Bem-Vindo ao Newton System!");
      window.location.href = 'file:///C:/Users/Andr%C3%A9%20Lima/Documents/GITHUB/Step-Homeworks/js/PROJETO-JS-ESCOLA-NOVO/assets/page/dashboard/dashboard.html#'
    }else{
      alert("Dados incorretos, tente novamente");
    }
}

