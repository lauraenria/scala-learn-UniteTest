package laura

/*
Given an array of integers, return a new array with each value doubled.
For example: [1, 2, 3] --> [2, 4, 6]
For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.
*/

object BeginnerLostWithoutMap8 {

  def doubleListLambda(arr: List[Int]):List[Int] = arr.map(n => n*2 )
  def doubleList(arr: List[Int]):List[Int] = arr.map( _*2 )

}