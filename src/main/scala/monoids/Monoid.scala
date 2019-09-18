package monoids

trait Monoid[A] {
//the identity
  def get[A]: A
  //the functor
  //def map[B](f: A=>B): Monad[B]
  //the bind
  //def flatMap[B](f: A => Monad[B]): Monad[B]
}
