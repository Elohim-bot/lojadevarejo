import java.time.LocalTime

class frnc {
    var nomeFantasia: String
    var frotaDeVeiculos: Byte
    var endereco: String
    var cnpj: Long
    var telefoneComercial: String
    var fundamentos: String
    var numeroDeFuncionarios: String
    var tempoDeEnvio: LocalTime
    var destinoDeEnvio: String
    var razaoSocial: String
    var dataDeFundacao: String

    constructor(
        nomeFantasia: String,
        frotaDeVeiculos: Byte,
        endereco: String,
        cnpj: Long,
        telefoneComercial:String,
        fundamentos: String,
        numeroDeFuncionarios: String,
        tempoDeEnvio: LocalTime,
        destinoDeEnvio: String,
        razaoSocial: String,
        dataDeFundacao: String,

    ) {
        this.nomeFantasia = nomeFantasia
        this.frotaDeVeiculos = frotaDeVeiculos
        this.endereco = endereco
        this.cnpj = cnpj
        this.telefoneComercial = telefoneComercial
        this.fundamentos = fundamentos
        this.numeroDeFuncionarios = numeroDeFuncionarios
        this.tempoDeEnvio = tempoDeEnvio
        this.destinoDeEnvio = destinoDeEnvio
        this.razaoSocial = razaoSocial
        this.dataDeFundacao = dataDeFundacao
    }

}