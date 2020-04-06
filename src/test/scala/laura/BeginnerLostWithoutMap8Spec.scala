package laura


import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BeginnerLostWithoutMap8Spec extends AnyFlatSpec with Matchers{

  "The given array" should "double each single element and return" in {
    BeginnerLostWithoutMap8.doubleListLambda(List(1,2,3,4,5)) should be(List(2,4,6,8,10))
  }

  it should "be empty if previously empty" in {
    BeginnerLostWithoutMap8.doubleListLambda(List()) should be(List())
  }
}
