package com.nani.graphqlserver.resolvers

import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.stereotype.Component
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.nani.graphqlserver.entity.Review
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query

@Component
class ReviewQueryResolver(private val mongoOperations: MongoOperations) : GraphQLQueryResolver {
    fun reviews(snackId: String) : List<Review> {
        val query = Query()
        query.addCriteria(Criteria.where("snackId").`is`(snackId))
        return mongoOperations.find(query, Review::class.java)
    }
}
