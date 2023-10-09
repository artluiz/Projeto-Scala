import Classes.Calculadora

object Main {
  def main(args: Array[String]): Unit = {
    val calc = new Calculadora

    //val result = Calculadora.soma(10,20) sem instânciar um objeto
    println("Soma: " + calc.soma(10, 20))
    println("Subtração: " + calc.sub(10, 20))
    println("Multiplicação: " + calc.multi(10, 20))
    println("Divisão: " + calc.div(10, 20))
  }

}