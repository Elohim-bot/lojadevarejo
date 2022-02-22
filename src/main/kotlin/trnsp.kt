class trnsp {
    var nomeFantasia:String
    var frotaDeVeiculos:String
    var capacidadeDeCarga:String
    var manutencaoDosVeiculos:String
    var destinoFinal:String
    var gastoEmCombustivel:String
    var lucroMensal:String
    var despezasExtras:String
    var razaoSocial: String
    var dataDeFundacao: String

    constructor(
        nomeFantasia: String,
        frotaDeVeiculos:String,
        capacidadeDeCarga:String,
        manutencaoDosVeiculos:String,
        destinoFinal:String,
        gastoEmCombustivel:String,
        lucroMensal:String,
        despezasExtras:String,
        razaoSocial: String,
        dataDeFundacao: String,
    ) {
        this.nomeFantasia = nomeFantasia
        this.frotaDeVeiculos = frotaDeVeiculos
        this.capacidadeDeCarga = capacidadeDeCarga
        this.manutencaoDosVeiculos = manutencaoDosVeiculos
        this.destinoFinal = destinoFinal
        this.gastoEmCombustivel = gastoEmCombustivel
        this.lucroMensal = lucroMensal
        this.despezasExtras = despezasExtras
        this.razaoSocial = razaoSocial
        this.dataDeFundacao = dataDeFundacao
    }
}