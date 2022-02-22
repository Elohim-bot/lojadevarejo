import java.time.LocalTime

abstract class seller {
    var nome:String
    var idade:Byte
    var genero:String
    var cpf:String
    var salario:Short
    var valeTransporte:Byte
    var valeAlimentacao:Byte
    var jornadaDeTrabalho: LocalTime
    var endereco: String
    var telefone: String

    constructor(
        nome: String,
        idade: Byte,
        genero: String,
        cpf: String,
        salario: Short,
        valeTransporte: Byte,
        valeAlimentacao: Byte,
        jornadaDeTrabalho: LocalTime,
        endereco1: String,
        telefone1: String,

        ) {
        this.nome = nome
        this.idade = idade
        this.genero = genero
        this.cpf = cpf
        this.salario = salario
        this.valeTransporte = valeTransporte
        this.valeAlimentacao = valeAlimentacao
        this.jornadaDeTrabalho = jornadaDeTrabalho
        this.endereco = endereco1
        this.telefone = telefone1
    }
}