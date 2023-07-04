package Aula50
import java.time.Year

class LinhaDoTempo {
    fun exibirLinhaDoTempo(anoNascimento: Int) {
        val anoAtual = Year.now().value

        for (ano in anoNascimento..anoAtual) {
            val idade = ano - anoNascimento
            println("Ano: $ano - Idade: $idade anos")
        }
    }
}
