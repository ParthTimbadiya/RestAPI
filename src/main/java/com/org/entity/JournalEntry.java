package com.org.entity;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;
@Document(collection = "journal_entries")
// @Data - include - @getter, @setter, @AllArgsConstructor, @NoArgsConstructor 
@Data
public class JournalEntry {
	
	@Id
	private ObjectId id;
	@NonNull
	private String title;
	private String content;
	private LocalDateTime date;
	
}
