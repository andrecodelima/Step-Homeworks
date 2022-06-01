// var time = null;
var brasileirao22 = [
    'Palmeiras',
    'Atlético-MG',
    'Corinthians',
    'Coritiba',
    'São Paulo',
    'Athletico-PR',
    'Botafogo',
    'Flamengo',
    'Santos',
    'América-MG',
    'Fluminense',
    'Internacional',
    'Avaí',
    'Bragantino',
    'Goiás',
    'Cuiabá',
    'Atlético-GO',
    'Juventude',
    'Ceará',
    'Fortaleza'
]

//LISTAGEM DE TIMES NO INDEX
for(let cont=1; cont<=20; cont++){
    // console.log(brasileirao22[cont])
    document.getElementById('lin1').innerHTML = brasileirao22[cont-20];
    if (document.getElementById('lin1').innerHTML != ''){
        document.getElementById('lin2').innerHTML = brasileirao22[cont-19];

    }if (document.getElementById('lin2').innerHTML == brasileirao22[cont-19]){
        document.getElementById('lin3').innerHTML = brasileirao22[cont-18];

    }if (document.getElementById('lin3').innerHTML == brasileirao22[cont-18]){
        document.getElementById('lin4').innerHTML = brasileirao22[cont-17];

    }if (document.getElementById('lin4').innerHTML == brasileirao22[cont-17]){
        document.getElementById('lin5').innerHTML = brasileirao22[cont-16];
    
    }if (document.getElementById('lin5').innerHTML == brasileirao22[cont-16]){
        document.getElementById('lin6').innerHTML = brasileirao22[cont-15];
    
    }if (document.getElementById('lin6').innerHTML == brasileirao22[cont-15]){
        document.getElementById('lin7').innerHTML = brasileirao22[cont-14];
        
    }if (document.getElementById('lin7').innerHTML == brasileirao22[cont-14]){
        document.getElementById('lin8').innerHTML = brasileirao22[cont-13];

    }if (document.getElementById('lin8').innerHTML == brasileirao22[cont-13]){
        document.getElementById('lin9').innerHTML = brasileirao22[cont-12];

    }if (document.getElementById('lin9').innerHTML == brasileirao22[cont-12]){
        document.getElementById('lin10').innerHTML = brasileirao22[cont-11];

    }if (document.getElementById('lin10').innerHTML == brasileirao22[cont-11]){
        document.getElementById('lin11').innerHTML = brasileirao22[cont-10];

    }if (document.getElementById('lin11').innerHTML == brasileirao22[cont-10]){
        document.getElementById('lin12').innerHTML = brasileirao22[cont-9];
    
    }if (document.getElementById('lin12').innerHTML == brasileirao22[cont-9]){
        document.getElementById('lin13').innerHTML = brasileirao22[cont-8];
    
    }if (document.getElementById('lin13').innerHTML == brasileirao22[cont-8]){
        document.getElementById('lin14').innerHTML = brasileirao22[cont-7];
    
    }if (document.getElementById('lin14').innerHTML == brasileirao22[cont-7]){
        document.getElementById('lin15').innerHTML = brasileirao22[cont-6];

    }if (document.getElementById('lin15').innerHTML == brasileirao22[cont-6]){
        document.getElementById('lin16').innerHTML = brasileirao22[cont-5];

    }if (document.getElementById('lin16').innerHTML == brasileirao22[cont-5]){
        document.getElementById('lin17').innerHTML = brasileirao22[cont-4];
    
    }if (document.getElementById('lin17').innerHTML == brasileirao22[cont-4]){
        document.getElementById('lin18').innerHTML = brasileirao22[cont-3];
        
    }if (document.getElementById('lin18').innerHTML == brasileirao22[cont-3]){
         document.getElementById('lin19').innerHTML = brasileirao22[cont-2];
    
    }if (document.getElementById('lin18').innerHTML == brasileirao22[cont-2]){
        document.getElementById('lin19').innerHTML = brasileirao22[cont-1];
    }
    if (document.getElementById('lin19').innerHTML == brasileirao22[cont-2]){
        document.getElementById('lin20').innerHTML = brasileirao22[cont-1];
    }

    // if (document.getElementById('lin19').innerHTML == brasileirao22[cont-1]){
    //      document.getElementById('lin20').innerHTML = brasileirao22[2];
    // }
}

//QUANTIDADE DE TIMES
quantidade = brasileirao22.length;
document.getElementById('resp1').innerHTML = quantidade;

for(let time in brasileirao22.sort()){
    // document.getElementById('resp2').innerHTML = brasileirao22[time];
    console.log(brasileirao22[time])
    document.write(brasileirao22[time])
}
//LISTAGEM DE TIMES NO INDEX POR ORDEM ALFABÉTICA
var letras = ['a', 'b', 'c'];
for (let i of letras) {
	console.log(i);
}
/*
saída:
a
b
c
*/
/*
saída:
0
1
2
*/

// 1a445by4i