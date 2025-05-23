package CoRpackage

class Application(
                   limit: Double,
                   minWage: Int,
                   minCreditNote: Int,
                   wageValidation: Boolean,
                   additionalDocs: Boolean
                 ) {
  // Will be checked by Assistant
  val _minWage: Int = minWage
  val _minCreditNote: Int = minCreditNote

  // Will be checked by Credit Expert
  val _wageValidations: Boolean = wageValidation
  val _additionalDocs: Boolean = additionalDocs

  // Will be checked by Area Manager
  val _limit: Double = limit
}
