import java.time.DateTimeException

fun main() {


}

open class Materia(nomeMateria: String) {

}

class Aula(materia: Materia, hrInicio: DateTimeException, hrTerm: DateTimeException) {

}

public open class Pessoa(nome: String) {}


class Aluno(nome: String, sobrenome: String, RA: Int) : Pessoa(nome) {
    fun assistiuAula(assiste: Boolean) {
        when (!assiste) {
            return -> true
        }
    }

    fun licaoDeCasa(fezLicao: Boolean) {
        when (!fezLicao) {
            return -> true
        }
    }
}

class Curso(nomeCurso: String, listaAula: List<Aula>, listaAluno: List<Aluno>, professorResp: Professor) {

}

open class Professor(nome: String, RD: Int) : Pessoa(nome) {
    fun darAulas() {

    }

    fun fazerChamadas() {

    }
}

class Turma(NomeTurma: String, cursoAssociado: Curso)