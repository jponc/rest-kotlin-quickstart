package org.acme.entity

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.persistence.Entity

@Entity
class Post : PanacheEntity() {
    lateinit var title: String
    lateinit var content: String
}
