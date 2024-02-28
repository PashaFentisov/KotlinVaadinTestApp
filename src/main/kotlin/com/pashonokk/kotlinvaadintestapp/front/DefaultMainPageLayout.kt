package com.pashonokk.kotlinvaadintestapp.front

import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route(value = "", layout = MainLayout::class)
class DefaultMainPageLayout: VerticalLayout(){

        init{
            add(Paragraph("Main Page default Content"))
        }
}