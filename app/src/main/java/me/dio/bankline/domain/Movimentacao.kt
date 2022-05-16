package me.dio.bankline.domain

data class Movimentacao(
    val id: Int,
    val dataHpra: String,
    val decricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,
    //TODO Mapear "idConta -> idCorrentista"
    val idCorrentista: Int
)
