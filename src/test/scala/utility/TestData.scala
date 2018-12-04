package utility

import customs.declaration.DeclarationSubmission.baseUrlFor

object TestData {

  def headers(): Map[String, String] = Map("Accept" -> "application/vnd.hmrc.1.0+json")

  val AcceptedCode = 202

  val authBaseUrl = baseUrlFor("auth")
  val apiBaseUrl = baseUrlFor("customs-declarations-metrics")

}
