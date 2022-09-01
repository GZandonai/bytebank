<<<<<<< HEAD
abstract class Conta(
    val titular: String,
    val numeroConta: Int,
) {
=======
abstract class Conta(val titular: String, val numeroConta: Int) {
>>>>>>> 94267aa6d7846c560aa1c4f1cc6962280dd09394
    var saldo = 0.0
    protected set


    //Deposita
    abstract fun deposita(valor: Double)


    //Saca
    abstract fun saca(valor: Double)


    //Transfere
    abstract fun transfere(valor: Double, destino: Conta): Boolean


}