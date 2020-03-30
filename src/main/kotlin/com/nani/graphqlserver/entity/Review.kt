package com.nani.graphqlserver.entity

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "review")
data class Review(
	var snackId: String,
	var rating: Number,
	var text: String
)
