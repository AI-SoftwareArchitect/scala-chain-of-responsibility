package CoRpackage

class Assistant extends Handler {
  override def handle(application: Application): Unit = {
    val isValid: Boolean = application._minWage > 4000 && application._minCreditNote > 1000

    if (hasNext && isValid) {
     next.foreach(_.handle(application))
    }
    else {
      println("Assistant is not valid");
    }

  }
}