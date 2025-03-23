package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Post
    public HttpResponse<User> createUser(@Body User user) {
        return HttpResponse.created(userService.createUser(user));
    }

    @Get("/{id}")
    public HttpResponse<User> getUser(@PathVariable Long id) {
        return HttpResponse.ok(userService.getUser(id));
    }

    @Put("/{id}")
    public HttpResponse<User> updateUser(@PathVariable Long id, @Body User user) {
        return HttpResponse.ok(userService.updateUser(id, user));
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return HttpResponse.noContent();
    }
}