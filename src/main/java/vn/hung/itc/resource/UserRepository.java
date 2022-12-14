package vn.hung.itc.resource;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import vn.hung.itc.entity.User;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<User, Long> {
}
