package chat.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Modela una sala de chat. Por favor, revise detenidamente la clase y complete las partes omitidas
 * atendiendo a los comentarios indicados mediante @TODO
 */
// @TODO completar las anotaciones de la clase
public class ChatRoom {

    // @TODO completar las anotaciones del atributo id (autogenerado)
    private Long id;

    // @TODO completar las anotaciones del atributo name
    private String name;

    // @TODO completar las anotaciones del atributo creator
    private User creator;

    // @TODO completar las anotaciones del atributo messages
    private Set<Message> messages;

    public ChatRoom() {

    }

    public ChatRoom(String name, User creator) {
        this.name = name;
        this.creator = creator;
        this.messages = new HashSet<Message>();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public User getCreator() {
        return this.creator;
    }

    public Set<Message> getMessages() {
        return this.messages;
    }
}
