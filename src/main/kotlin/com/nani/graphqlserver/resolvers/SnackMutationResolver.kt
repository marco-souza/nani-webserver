package com.nani.graphqlserver.resolvers

import com.nani.graphqlserver.repository.SnackRepository
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.stereotype.Component
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.nani.graphqlserver.entity.Review
import com.nani.graphqlserver.entity.Snack
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query

@Component
class SnackMudationResolver(private val snackRepository: SnackRepository) : GraphQLQueryResolver {
    fun snacks() : List<Snack> {
        val list = snackRepository.findAll()

        for (item in  list) {
            item.reviews = getReviews(snackId = item.id)
        }
        return list
    }

    private fun getReviews(snackId: String): List<Review> {
        val query = Query()
        query.addCriteria(Criteria.where("snackId").`is`(snackId))
        return mongoOperations.find(query, Review::class.java)
    }
}
