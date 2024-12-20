import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ConsultaComponent } from '../consulta/consulta.component';

@Component({
  selector: 'app-cadastro',
  standalone: true, 
  imports: [FormsModule, CommonModule, ConsultaComponent],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {

  produto = {
    nome: '',
    categoria:'',
    quantidade:null,
    preco:''
  }

  produtos: any[] = []
  mensagem_sucesso: string | null = null
  mensagem_erro: string | null = null

  cadastrar(){
    if(this.produto.nome && this.produto.categoria && this.produto.quantidade && this.produto.preco){
      this.produtos.push({...this.produto})
      this.mensagem_sucesso = `Produto "${this.produto.nome}" cadastrado com sucesso`
      
      this.produto = {
        nome: '',
        categoria:'',
        quantidade:null,
        preco:''
      }

      setTimeout(()=> this.mensagem_sucesso = null, 2000)
    }else if(!this.produto.nome && !this.produto.categoria && !this.produto.quantidade && !this.produto.preco){

      this.mensagem_erro = "Campos sem prenchimento"
      setTimeout(()=> this.mensagem_erro = null, 2000)

    }
  }
 
}
