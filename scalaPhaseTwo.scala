
import scala.collection.mutable.ListBuffer
import scala.io.Source

object scalaPhaseTwo {
  def main(args: Array[String]): Unit = {
    var minSupport = 2
    var oneCandidateItemSet=new ListBuffer[String]()
    var tempList=new ListBuffer[String]()


    var count = 0
    var a=List( List("A","C","D"), List("B", "C", "E"),
      List("A","B","C", "E"),List("B", "E"))

    var distinctItem=a.flatten.distinct.sorted
    println("\nGiven Distinct Items   \n "+distinctItem+"\n\n")
    for(i<-distinctItem){
      count = 0
      for(j<-a){
        if(j.contains(i))
          count+=1
      }
      if((count)>=minSupport)
        oneCandidateItemSet+=i
    }

    var k=1
    var  candidateItems=oneCandidateItemSet.combinations(1).toList //generate                                list of list so that same 'candiateItems'                               variable can be used in next loop while                                    (oneCandidateItemSet.length>=1) etc
    println(k+" Frequent Item Set")
    println(candidateItems)
    println("\n")
    // while(candidateItems.length>=1){
    k+=1
    if(k<=2){
      var candidateCombination=oneCandidateItemSet.combinations(k).toList

      println(k+" Frequent ItemSets")
      for(i<-candidateCombination){
        count=0
        for(j<-a){
          if(i.forall(j.contains)==true) count+=1
        }
        if(count>=minSupport) {
          println(i,count)
        }        }
    } //end of k<=2

    else{



    }

    //  }

  }
}

