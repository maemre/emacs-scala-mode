import scala.collection.Map

class Graph(edges: Map[Symbol, Set[Symbol]]):

  val x = 10

  def f(x: Int) =
    val y = x * x
    y + x

  def g(x: String, y: List[Int]) = {
    y.map(_.toString) mkString x
  }
