package CoRpackage

trait Handler {
    // next baştan null değil, Option ile daha güvenli yapabiliriz
    private var _next: Option[Handler] = None
    final def setNext(handler: Handler): Unit = _next = Some(handler)
    final def hasNext: Boolean = _next.isDefined
    final def next: Option[Handler] = _next
    def handle(application: Application): Unit
}
