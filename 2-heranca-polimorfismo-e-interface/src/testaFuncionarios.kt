fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "333.888.444-41",
        salario = 1000.0
    )

    val fran = Gerente(
        nome = "Fran",
        cpf = "333.333.333-33",
        salario = 2000.0,
        senha = 1234
    )

    val gui = Diretor(
        nome = "Gui",
        cpf = "555.555.555-55",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    val maria = Analista(
        nome = "Maria",
        cpf = "777.777.777-77",
        salario = 3000.0
    )

    println(
        "nome: ${alex.nome}, " +
                "cpf: ${alex.cpf}, " +
                "salário: ${alex.salario}, " +
                "bonificação: ${alex.bonificacao}"
    )

    println(
        "nome: ${fran.nome}, " +
                "cpf: ${fran.cpf}, " +
                "salário: ${fran.salario}, " +
                "bonificação: ${fran.bonificacao}"
    )

    println(
        "nome: ${gui.nome}, " +
                "cpf: ${gui.cpf}, " +
                "salário: ${gui.salario}, " +
                "bonificação: ${gui.bonificacao}, " +
                "plr: ${gui.plr}"
    )

    if (fran.autentica(1234)) {
        println("${fran.nome}: autenticado com sucesso")
    } else {
        println("${fran.nome}: falha na autenticação")
    }

    if (gui.autentica(4000)) {
        println("${gui.nome}: autenticado com sucesso")
    } else {
        println("${gui.nome}: falha na autenticação")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}