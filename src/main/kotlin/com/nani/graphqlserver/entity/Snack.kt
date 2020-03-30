package com.nani.graphqlserver.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "snack")
data class Snack(
	var name: String,
	var amount: Number
) {
	@Id
	var id: String = ""

	@Transient
	var reviews: List<Review> = ArrayList()
}
