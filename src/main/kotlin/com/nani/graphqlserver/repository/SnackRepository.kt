package com.nani.graphqlserver.repository

import com.nani.graphqlserver.entity.Snack
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SnackRepository : MongoRepository<Snack, String>
