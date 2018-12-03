package customs.declaration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder
import uk.gov.hmrc.performance.conf.ServicesConfiguration
import utility.TestData._
import utility.TestDataPayload.validSubmissionsPayload

object DeclarationSubmission extends ServicesConfiguration {

  def submitDeclarationMetrics(): HttpRequestBuilder = http("Submit Declaration Metrics")
    .post(s"$apiBaseUrl/log-times")
    .headers(headers())
    .body(StringBody(validSubmissionsPayload.toString()))
    .check(status.is(AcceptedCode))

}
