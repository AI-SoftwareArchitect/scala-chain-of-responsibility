package CoRpackage

class CreditExpert extends Handler {
  override def handle(application: Application): Unit = {
    val isValid = application._wageValidations && application._additionalDocs;
    
    if (hasNext && isValid) {
      next.foreach(_.handle(application));
    }
    else  {
      println("Credit Expert is not valid");
    }
  }
}
