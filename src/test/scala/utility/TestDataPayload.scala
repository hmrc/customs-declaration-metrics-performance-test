package utility

object TestDataPayload {

  val validSubmissionsPayload = {
    """{ "eventType": "DECLARATION", "conversationId": "dff783d7-44ee-4836-93d0-3242da7c225f", "eventStart": "2014-10-21T00:36:14.123Z", "eventEnd": "2014-10-21T00:38:14.123Z"}"""
  }

  val validNotificationPayload = {
    """{ "eventType": "NOTIFICATION", "conversationId": "dff783d7-44ee-4836-93d0-3242da7c225f", "eventStart": "2014-10-21T00:36:14.123Z", "eventEnd": "2014-10-21T00:38:14.123Z"}"""
  }
}
