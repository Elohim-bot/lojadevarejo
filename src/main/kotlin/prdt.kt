class prdt {
    var nome:String
    var validade:String
    var lote:String
    var tipoDeProduto:String
    var fornecedores:String
    var tipoDeTransporte:String
    var quantidadeEmEstoque:Short
    var precoDeCompra:String
    var precoDeVenda:String
    var localizacaoDoProduto:String
    var transportadora:String
    var quantidadeEmTransporte:Byte

    constructor(
        nome:String,
        validade:String,
        lote:String,
        tipoDeProduto:String,
        fornecedores:String,
        tipoDeTransporte:String,
        quantidadeEmEstoque:Short,
        precoDeCompra:String,
        precoDeVenda:String,
        localizacaoDoProduto:String,
        transportadora:String,
        quantidadeEmTransporte:Byte,
    ) {
        this.nome = nome
        this.validade = validade
        this.lote = lote
        this.tipoDeProduto = tipoDeProduto
        this.fornecedores = fornecedores
        this.tipoDeTransporte = tipoDeTransporte
        this.quantidadeEmEstoque = quantidadeEmEstoque
        this.precoDeCompra = precoDeCompra
        this.precoDeVenda = precoDeVenda
        this.localizacaoDoProduto = localizacaoDoProduto
        this.transportadora = transportadora
        this.quantidadeEmTransporte = quantidadeEmTransporte
    }
}