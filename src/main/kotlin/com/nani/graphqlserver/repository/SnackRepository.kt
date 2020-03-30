package com.nani.graphqlserver.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "review")
data class Review(
	var snackID: String,
	var rating: Number,
	var text: String
)
