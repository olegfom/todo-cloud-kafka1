package com.apress.todo.domain;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ToDo {
private String id;
private String description;
private LocalDateTime created;
private LocalDateTime modified;
private boolean completed;

    public ToDo(){
        this.id = UUID.randomUUID().toString();
        this.created = LocalDateTime.now();
        this.modified = LocalDateTime.now();
    }
    public ToDo(String description){
        this();
        this.description = description;
    }
    
    public ToDo(String description,boolean completed){
        this(description);
        this.completed = completed;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public LocalDateTime getModified() {
		return modified;
	}
	public void setModified(LocalDateTime modified) {
		this.modified = modified;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}