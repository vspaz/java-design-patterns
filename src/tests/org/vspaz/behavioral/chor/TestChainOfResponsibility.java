package org.vspaz.behavioral.chor;

import org.junit.jupiter.api.Test;

public class TestChainOfResponsibility {
  @Test
  void testChainOfResponsibilityOk() {
    IssueHandler issueHandler = new IssueHandler();
    FaxErrorHandler faxErrorHandler = new FaxErrorHandler();
    EmailErrorHandler emailErrorHandler = new EmailErrorHandler();

    issueHandler.handleNextError(faxErrorHandler);
    faxErrorHandler.nextErrorHandler(emailErrorHandler);
    emailErrorHandler.nextErrorHandler(null);

    Message message_1 = new Message("fax is slow", MessagePriority.HIGH);
    Message message_2 = new Message("email aren't reaching", MessagePriority.HIGH);
    Message message_3 = new Message("cc disabled", MessagePriority.NORMAL);
    Message message_4 = new Message("fax never reach", MessagePriority.HIGH);

    issueHandler.raiseError(message_1);
    issueHandler.raiseError(message_2);
    issueHandler.raiseError(message_3);
    issueHandler.raiseError(message_3);
  }
}
