package io.jzheaux.springsecurity.resolutions;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "authorities")
public class UserAuthority {

    @Id
    UUID id;

    @Column
    String authority;

    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    User user;

    public UserAuthority(String authority, User user) {
        this.id = UUID.randomUUID();
        this.authority = authority;
        this.user = user;
    }

    public UserAuthority() {

    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
