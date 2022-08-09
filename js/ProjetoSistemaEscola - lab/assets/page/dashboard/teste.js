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
        alert("dados corretos");
        window.location.href = 'file:///C:/Users/Andr%C3%A9%20Lima/Documents/GITHUB/Step-Homeworks/js/PROJETO-JS-ESCOLA-NOVO/assets/page/dashboard/dashboard.html#'
      }else{
        alert("Dados incorretos, tente novamente");
      }
}

