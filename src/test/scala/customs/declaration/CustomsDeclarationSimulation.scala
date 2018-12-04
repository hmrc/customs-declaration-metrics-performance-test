package customs.declaration

import uk.gov.hmrc.performance.simulation.PerformanceTestRunner
import customs.declaration.DeclarationSubmission._
import customs.declaration.NotificationSubmission._

class CustomsDeclarationSimulation extends PerformanceTestRunner {

  setup("submit-declaration-metrics", "Send Customs Declaration Metrics") withRequests submitDeclarationMetrics
  setup("submit-notification-metrics", "Send Customs Notification Metrics") withRequests submitNotificationMetrics

  runSimulation()
}
