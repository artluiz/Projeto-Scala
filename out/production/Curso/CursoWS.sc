def ehPar(x: Int): Boolean = x % 2 == 0

def ehImpar(y: Int): Boolean = !ehPar(y)

ehImpar(10)

val lista = List(1,2,3,4,5)

lista.filter(x => ehPar(x))
lista.filterNot(x => ehPar(x))

lista.map(x => x*2)