import { Component } from '@angular/core';
import { CadastroComponent } from './cadastro/cadastro.component';


@Component({
  selector: 'app-root',
  standalone: true, 
  imports: [CadastroComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'cadastro_produto';
}
