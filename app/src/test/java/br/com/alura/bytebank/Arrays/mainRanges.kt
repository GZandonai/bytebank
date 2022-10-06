package br.com.alura.bytebank.br.com.alura.bytebank.Arrays



fun main (){

   var serie: IntRange = 1.rangeTo(10)
    for (s in serie){
        println("$s")
    }
    println()

    var numeroPares = 0.until (100) step 2
    for (numeroPar in numeroPares) {
        println(numeroPar)
    }

    println()

  var numerosParesReverso =  100 downTo 0 step 2
    numerosParesReverso.forEach{ println("$it")}


    val intervalo = 1500.0..5000.0
    val salario = 5001.0
    if(salario in intervalo) {
        println("Esta dentro do intervalo")
    } else{
        println("nao esta dentro do intervalo")
    }
    println()


    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)




    var idades:IntArray = intArrayOf(10,12,18,33,40,67)

    var maiorIdade = idades.max()
    println("$maiorIdade")
    var menorIdade = idades.min()
    println("$menorIdade")
    var mediaIdades = idades.average()
    println("$mediaIdades")
    var todosMaiores = idades.all{(it > 18)}
    println("$todosMaiores")
    var algumMenor = idades.any{(it >= 18)}
    println("$algumMenor")
    var listaMariores = idades.filter { it >= 18 }
    println("$listaMariores")
    var especificaIdade = idades.find { it == 18 }
    println("$especificaIdade")
}


