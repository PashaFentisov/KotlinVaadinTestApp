package com.pashonokk.kotlinvaadintestapp.front

import com.pashonokk.kotlinvaadintestapp.entity.User
import com.vaadin.flow.component.grid.Grid
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate

@Route(value = "users-list", layout = MainLayout::class)
class UsersList(private val restTemplate: RestTemplate): VerticalLayout() {
    private val grid: Grid<User> = Grid()
    init{
        configureGrid()
        add(Paragraph("Users List"),  grid)
    }

    private fun configureGrid() {
        grid.addColumn(User::id).setHeader("ID")
        grid.addColumn(User::email).setHeader("Email")
        grid.addColumn(User::name).setHeader("Name")
        grid.columns.forEach{it.setAutoWidth(true)}
        grid.setPartNameGenerator { user-> if(user.id>=2) "styled" else "" }
        grid.setItems(getUsers())
    }

    private fun getUsers(): List<User> {
        val entity: ResponseEntity<List<User>> = restTemplate.exchange(
            "http://localhost:8080/api/v1/users",
            HttpMethod.GET,
            null,
            object: ParameterizedTypeReference<List<User>>() {}
        )
        return entity.body.orEmpty()
    }

}