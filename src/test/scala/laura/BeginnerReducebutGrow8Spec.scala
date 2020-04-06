package laura

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BeginnerReducebutGrow8Spec extends AnyFlatSpec with Matchers {
  "The list" should "return multiply number of all the list's number in order" in {
      BeginnerReducebutGrow8.multiplesListInOder(List(1,2,3,4)) should be(24)
  }
}
