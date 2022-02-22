class clnt {
    val nome: String
    val cpf: String
    val formaDePagamento: String
    val idade: String

    constructor(
        nome: String,
        cpf:String,
        formaDePagamento:String,
        idade: String,
    ) {
        this.nome = nome
        this.cpf = cpf
        this.formaDePagamento = formaDePagamento
        this.idade = idade
    }
}