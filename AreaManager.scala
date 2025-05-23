package CoRpackage

import java.io.IO.println

class AreaManager extends Handler{
  override def handle(application: Application): Unit =  {
    if (application._limit > 100000) {
      println("Area Manager is valid");
    }
    else {
      println("Area Manager is not valid");
    }
  }
}
