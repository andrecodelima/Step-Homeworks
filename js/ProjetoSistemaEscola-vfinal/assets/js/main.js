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
  constructor(pNome, pSobrenome, pCidade, pEstado, pUser, pSenha){

      this.nome         = pNome
      this.sobrenome    = pSobrenome
      this.cidade       = pCidade
      this.estado       = pEstado
      this.usuario      = pUser
      this.senha        = pSenha
  }
}

var nome              = document.getElementById('InputNome')
var sobrenome         = document.getElementById('InputSobrenome')
var cidade            = document.getElementById('InputCidade')
var estado            = document.getElementById('InputUF')
var usuario           = document.getElementById('InputUser')
var senha             = document.getElementById('InputSenha')

var bancoCadastro     = []

var bancoSenhas       = []
var formulario        = document.getElementById('form')


function cadastrar(){
  bancoCadastro.push(new cadastroLogin(nome.value, 
                                      sobrenome.value, 
                                      cidade.value,
                                      estado.value,
                                      usuario.value,
                                      senha.value
                                      ))
    
    if((nome.value && sobrenome.value && cidade.value && estado.value && usuario.value && senha.value) != ''){
      alert('CADASTRO REALIZADO COM SUCESSO!')
    }else{
      alert('Atenção! Pelo menos um campo não foi preenchido!')
    }
    formulario.reset()


}

function login(){
  if (usuario.value == "step@gmail.com" && senha.value == "jw") {
      alert("Seja Bem-Vindo ao Newton System!");
      location.assign('https://www.jw.org/Pt')

      // window.location.href = 'file:///C:/Users/Suporte.CertiRio/Documents/GITHUB/Step-Homeworks/js/ProjetoSistemaEscola%20-%20lab/assets/page/dashboard/dashboard.html'
    }else{
      alert("Dados incorretos, tente novamente");
    }

}



// function cadastrar(){
//   bancoSenhas.push(new cadastroLogin(usuario.value, senha.value))
//   alert('Usuário Cadastrado com sucesso!')

//   // if(usuario.value == usuario.value){
//   //     alert('Já existe um usuário com esse nome. Escolha outro.')
//   // }
//   // console.log(bancoSenhas)

// }