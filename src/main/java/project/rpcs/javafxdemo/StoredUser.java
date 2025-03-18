package project.rpcs.javafxdemo;

public record StoredUser(
    String username,
    String password,
    boolean hasBeenUsed
) { }
