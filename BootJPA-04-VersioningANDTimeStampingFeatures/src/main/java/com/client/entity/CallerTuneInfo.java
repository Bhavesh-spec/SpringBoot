package com.client.entity;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name = "CALLER_TUNE_INFO")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class CallerTuneInfo {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer tuneId;
@Column(length = 20)
@NonNull
private String tuneName;
@Column(length = 20)
@NonNull
private String movieName;
@Version // how many times values are updated in db object (record),that many times values are incremented
@Column(name = "update_count")
private Integer updatedCount;
@Column(name = "service_opted_on")
@CreationTimestamp//object save in db time
private LocalDateTime serviceOptedOn;
@Column(name = "lastly_updated_on")
@UpdateTimestamp//object update in db time
private LocalDateTime lastlyUpdatedOn;
}
