package Classes

import scala.util.Try

class Calculadora {

  def soma(x: Int, y:Int): Int = x+y
  def + = soma _

  def sub(x: Int, y:Int): Int = x-y
  def - = sub _

  def multi(x: Int, y:Int): Int = x*y
  def * = multi _

  def div(divid: Double, divis: Double): Double = Try(divid / divis).getOrElse(0)
  def / = div _

}
