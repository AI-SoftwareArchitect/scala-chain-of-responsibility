package CoRpackage

object userApplication {
  val application = new Application(
    limit = 120000.0,           // Alan Müdürü onayı gerekecek çünkü 100k üstü
    minWage = 4500,             // Asistan kontrolü için yeterli
    minCreditNote = 720,        // Asistan için yeterli not
    wageValidation = true,      // Uzman doğrulamış
    additionalDocs = true       // Belgeler eklenmiş
  )
}
