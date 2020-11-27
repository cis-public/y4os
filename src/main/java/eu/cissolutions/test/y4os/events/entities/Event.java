package eu.cissolutions.test.y4os.events.entities;

public final class Event {
    private final long id;
    private final String name;
    private final EventRegistrationType registrationType;
    private final String password;

    public Event(long id, String name, EventRegistrationType registrationType, String password) {
        this.id = id;
        this.name = name;
        this.registrationType = registrationType;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EventRegistrationType getRegistrationType() {
        return registrationType;
    }

    public String getPassword() {
        return this.password;
    }

    public enum EventRegistrationType {
        PUBLIC,
        REGISTERED_ONLY,
        PASSWORD_PROTECTED
    }

}
