fun main() {
    val vendedor = Vendedor(
        nome = "Alexander Bandeira",
        idade = 23,
        genero = "masculino",
        cpf = "950.260.000.10",
        endereco = "Rua das Cracas,527 - Porto Alegre",
        telefone = "51986566840",
        valeTransporte = 380,
        jornadaDeTrabalhoDiaria = 8,
        valeAlimentacao = 300


    )
    println(
        "nome: ${vendedor.nome}, idade: ${vendedor.idade}, gênero: ${vendedor.genero}, cpf: ${vendedor.cpf}," +
                "endereço: ${vendedor.endereco},telefone: ${vendedor.telefone}"
    )

    val cliente = Cliente(
        nome = "Paulo Arantes",
        cpf = "861.521.000.52",
        idade = 32
    )
     println(
         "nome: ${cliente.nome}, cpf: ${cliente.cpf}, idade: ${cliente.idade}"
     )
    val produto = Produto(
        nome = "Limpol",
        validade = "19/06/2024",
        lote = "210",
        tipoDeProduto = "detergente liquido",
        fornecedores = "Bombril",
        tipoDeTransporte = "caminhão",
        quantidadeEmEstoque = "400",
        precoDeCompra = "1,00",
        precoDeVenda = "2,49",
        localizacaoDoProduto = "corredor3",
        transportadora = "Bombril S/A",
        quantidadeEmTransporte = "200",
    )
    println(
        "nome: ${produto.nome}, validade: ${produto.validade},lote: ${produto.lote},tipo de produto: ${produto.tipoDeProduto}," +
                "fornecedores: ${produto.fornecedores},tipo de transporte: ${produto.tipoDeTransporte},quantidade em estoque: ${produto.quantidadeEmEstoque}," + "preço de compra: ${produto.precoDeCompra},preço de venda: ${produto.precoDeVenda},localização do produto: ${produto.localizacaoDoProduto},transportador: ${produto.transportadora},quantidade em transporte: ${produto.quantidadeEmTransporte}"



    )
    val fornecedor = Fornecedor(
        nomeFantasia = "Bombril",
        frotaDeVeiculos = 30,
        endereco = "Rua Antônio Barreto, 130 – Sala 1708 – Bairro Umarizal",
        cnpj = "50.564.053/0001-03.",
        telefoneComercial = "0800 7076161",
        dataDeCriacao = "14/01/1948",
        fundamentos = "blablablabla",
        numeroDeFuncionarios = "300",
        tempoDeEnvio = "4 horas",
        destinoDeEnvio = "Varejão",
    )
    println(
        "nome fantasia: ${fornecedor.nomeFantasia},frota de veículos: ${fornecedor.frotaDeVeiculos},endereço: ${fornecedor.endereco}," +
                "cnpj: ${fornecedor.cnpj},telefone comercial: ${fornecedor.telefoneComercial},data de criação: ${fornecedor.dataDeCriacao}," +
                "fundamentos:${fornecedor.fundamentos},número de funcionários: ${fornecedor.numeroDeFuncionarios},tempo de envio: ${fornecedor.tempoDeEnvio},destino de envio: ${fornecedor.destinoDeEnvio}}"
    )

    val transportadora = Transportadora(
        nomeFantasia = "Transportadora Nasa Cargas",
        frotaDeVeiculos = "500",
        capacidadeDeCarga = "3 toneladas por caminhão",
        manutencaoDosVeiculos = "2 vezes ao mês",
        destinoFinal = "mercados de varejo",
        gastoEmCombustivel = "R$3.900,00 por mês cada caminhão",
        lucroMensal = "R$30.000.000,00",
        despesasExtras = "R$3.000.000,00 ao mês",
        razaoSocial = "auxiliar a econômia do país contribuindo com a distribuição de produtos ao lares brasileiros",
        dataDeFundacao = "15/01/1999",
        cnpj = "02.935.035/0001-48",
    )
    println(
        "nome fantasia: ${transportadora.nomeFantasia},frota de veículos: ${transportadora.frotaDeVeiculos},capacidade de carga: ${transportadora.capacidadeDeCarga},manutenção dos veículos:${transportadora.manutencaoDosVeiculos},destino final: ${transportadora.destinoFinal},gasto em combustível: ${transportadora.gastoEmCombustivel},lucro mensal: ${transportadora.lucroMensal},despesas extras: ${transportadora.despesasExtras},razão social: ${transportadora.razaoSocial},data de fundação: ${transportadora.dataDeFundacao},cnpj: ${transportadora.cnpj}"
    )
















}