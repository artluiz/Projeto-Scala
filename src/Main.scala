import Classes.Calculadora

object Main {
  def main(args: Array[String]): Unit = {
    val calc = new Calculadora

    //val result = Calculadora.soma(10,20) sem instânciar um objeto
    val result = calc.soma(10,20)
    println(s"O resultado é $result")
  }
}