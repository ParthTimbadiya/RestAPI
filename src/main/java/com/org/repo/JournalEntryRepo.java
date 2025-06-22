package com.org.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.org.entity.JournalEntry;

public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId> {

}
