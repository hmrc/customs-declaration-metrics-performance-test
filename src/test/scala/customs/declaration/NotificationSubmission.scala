package customs.declaration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder
import utility.TestData._
import utility.TestDataPayload.validNotificationPayload

object NotificationSubmission {

  def submitNotificationMetrics(): HttpRequestBuilder = http("Submit Notification Metrics Request")
    .post(s"$apiBaseUrl/log-times")
    .headers(headers())
    .body(StringBody(validNotificationPayload.toString()))
    .check(status.is(AcceptedCode))

}
