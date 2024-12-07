package com.revisor.myapp.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "classes")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String smallDescription;

    @Column(name = "poster_url")
    private String posterUrl;

    private LocalDateTime eventTime;
    private LocalDate eventDate;

    public LocalDate getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    private int availableSeats;

    private BigDecimal price;




    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSmallDescription() {
        return smallDescription;
    }
    public void setSmallDescription(String smallDescription) {
        this.smallDescription = smallDescription;
    }
    public String getPosterUrl() {
        return posterUrl;
    }
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
    public LocalDateTime getEventTime() {
        return eventTime;
    }
    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // @Column(name = "created_at")
    // private LocalDateTime createdAt;

    // @PrePersist
    // protected void onCreate() {
    //     createdAt = LocalDateTime.now();
    // }
}

