package laura

/*
Given a non-empty array of integers, return the result of multiplying the values together in order.
Example: [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */

object BeginnerReducebutGrow8 {
  def multiplesListInOder(list: List[Int]): Int = {
    list.sorted.reduce({ (a, b) => a * b })
  }
}
