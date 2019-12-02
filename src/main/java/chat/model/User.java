package chat.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Modela un usuario. Por favor, revise detenidamente la clase y complete las partes omitidas
 * atendiendo a los comentarios indicados mediante @TODO
 */
// @TODO completar las anotaciones de la clase
public class User {

    // @TODO completar las anotaciones del atributo id (autogenerado)
    private Long id;

    // @TODO completar las anotaciones del atributo username
    private String username;

    // @TODO completar las anotaciones del atributo chatRooms
    private Set<ChatRoom> chatRooms;

    // @TODO completar las anotaciones del atributo messages
    private Set<Message> messages;

    public User () {

    }

    public User (String username) {
        this.username = username;
        this.chatRooms = new HashSet<ChatRoom>();
        this.messages = new HashSet<Message>();
    }

    public Long getId() {
        return this.getId();
    }

    public String getUsername () {
        return this.username;
    }

    public Set<ChatRoom> getChatRooms() {
        return this.chatRooms;
    }

    public Set<Message> getMessages() {
        return this.messages;
    }
}
