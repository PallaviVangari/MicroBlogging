package com.microblogging.feed.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("user_timeline")
@AllArgsConstructor
@NoArgsConstructor
public class UserTimeline {

    @PrimaryKey
    @JsonIgnore
    private UserTimelineKey key;

    private String author_id;
    private String content;

    @JsonProperty("userId")
    public String getUserId() {
        return key.getUserId();
    }

    @JsonProperty("tweetTimestamp")
    public LocalDateTime getTweetTimestamp() {
        return key.getTweetTimestamp();
    }

    @JsonProperty("tweetId")
    public String getTweetId() {
        return key.getTweetId();
    }

}
