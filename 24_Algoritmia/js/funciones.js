//tarea problema 1
function problema1() {
    var palabra = document.querySelector('#p1-input').value;

    var palabraInvertida =  palabra.split('').reverse().join('');
    
    document.querySelector('#p1-output').textContent = palabraInvertida.replace();
}

//problema 2
function problema2(){

    /*
    para encontrar el minimo producto escalar entre 2 
    vectores tenemos que realizar
    las operaciones correspondientes con el maximo
    valor de un vector por el minimo valor 
    del otro vector, con esto
    encontraremos el minimo producto escalar
    */ 

    var p2_x1 = document.querySelector('#p2-x1').value;
    var p2_x2 = document.querySelector('#p2-x2').value;
    var p2_x3 = document.querySelector('#p2-x3').value;
    var p2_x4 = document.querySelector('#p2-x4').value;
    var p2_x5 = document.querySelector('#p2-x5').value;

    var p2_y1 = document.querySelector('#p2-y1').value;
    var p2_y2 = document.querySelector('#p2-y2').value;
    var p2_y3 = document.querySelector('#p2-y3').value;
    var p2_y4 = document.querySelector('#p2-y4').value;
    var p2_y5 = document.querySelector('#p2-y5').value;

    //construir el vector
    var v1 = [p2_x1, p2_x2, p2_x3, p2_x4, p2_x5];
    var v2 = [p2_y1, p2_y2, p2_y3, p2_y4, p2_y5];

    v1 = v1.sort(function(a, b){
        return b-a;
    });

    v2 = v2.sort(function(a, b){
        return b-a;
    });

    v2 = v2.reverse();

    var p2_producto = 0;

    for(var i = 0; i < v1.length; i++){
        p2_producto += v1[i]*v2[i];
    } 

    document.querySelector('#p2-output').textContent = 
    'Producto Escalar minimo ' + p2_producto;
}

function problema3(texto, caracter){
//hola
    
    var texto = document.querySelector('#p3-input').value;
    var caracter = document.querySelector('#p3-input');
    
    
    if (typeof texto != 'string') {
        throw TypeError('No valido, solo caracter');
    }
    
    if (typeof caracter != 'string') {
        throw TypeError('No valido, solo caracter');
    }
    
    if (caracter.length != 1) {
        throw Error('La longitud del caracter es igual a 1.');
    }
    
    let conteoOcurrencias = 0;
    
    for (let i = 0; i < texto.length; i++) {

        if (texto.charAt(i) == caracter) {
            ++conteoOcurrencias;
        }
    }
    
    document.querySelector('#p3-output').slot = conteoOcurrencias;

    return conteoOcurrencias;
       
    
}