
abstract class Conta(
    val titular: String,
    val numeroConta: Int,
) {
abstract class Conta(val titular: String, val numeroConta: Int) {

    var saldo = 0.0
    protected set


    //Deposita
    abstract fun deposita(valor: Double)


    //Saca
    abstract fun saca(valor: Double)


    //Transfere
    abstract fun transfere(valor: Double, destino: Conta): Boolean


}
}