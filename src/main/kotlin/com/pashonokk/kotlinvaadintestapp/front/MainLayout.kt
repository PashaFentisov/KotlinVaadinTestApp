package com.pashonokk.kotlinvaadintestapp.front

import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.applayout.DrawerToggle
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.router.RouterLink

class MainLayout(): AppLayout(){

    init{
        addToNavbar(DrawerToggle())
        addToNavbar(Paragraph("Kotlin Vaadin Test App"))

        addToDrawer(RouterLink("UsersList", UsersList::class.java))
    }
}