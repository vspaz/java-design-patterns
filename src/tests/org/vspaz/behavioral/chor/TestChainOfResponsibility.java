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
  }
}
