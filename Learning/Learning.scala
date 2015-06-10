object Learning {
   def main(args: Array[String]): Unit = {
      main1
      main2
   }

   def main1() : Unit = {
      val it = Iterator("a", "number", "of", "words")

      while (it.hasNext) {
         println(it.next())
      }
   }

   def main2() : Unit = {
      val ita = Iterator(20, 40, 2, 50, 69, 90)
      val itb = Iterator(20, 40, 2, 50, 69, 90)

      println("Maximum valued element: " + ita.max)
      println("Minimum valued element: " + itb.min)

      println("Lol " + ita.size)
   }
   
}