package org.vspaz.behavioral.mediator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMediator {
  @Test
  void testMediatorOk() {
    Mediator mediator = new Mediator();
    ChatUser chatUser_1 = new ChatUser(mediator, "chatUser_1");
    List<User> chatRoom = mediator.register(chatUser_1);

    assertEquals(chatRoom.size(), 1);

    ChatUser chatUser_2 = new ChatUser(mediator, "chatUser_2");
    chatRoom = mediator.register(chatUser_2);
    assertEquals(chatRoom.size(), 2);

    ChatUser unregisteredUser = new ChatUser(mediator, "unregisteredUser");

    assertEquals(
        String.format("'chatUser_1' posted message at %s", mediator.getCurrentTime()),
        chatUser_1.notify("foo"));

    assertEquals(
        String.format("'chatUser_2' posted message at %s", mediator.getCurrentTime()),
        chatUser_2.notify("bar"));

    assertEquals("unknown user 'unregisteredUser' tries to notify", unregisteredUser.notify("baz"));
  }
}
