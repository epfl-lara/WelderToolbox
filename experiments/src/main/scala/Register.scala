import inox._
import inox.trees.{forall => _, _}
import inox.trees.dsl._

import welder._

object Register{
  import List._
  //---------------------------Registering elements-----------------------------------
  val listADTs = Seq(listADT, nilADT, consADT)
  val listOperations = Seq(lengthFunction, subtermFunction)

  val symbols = NoSymbols
    .withADTs(listADTs)
    .withFunctions(listOperations)

  val program = InoxProgram(Context.empty, symbols)
  val theory = theoryOf(program)
}