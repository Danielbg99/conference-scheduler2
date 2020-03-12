package conferencescheduler.conferencescheduler.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "speakers")
public class Speaker extends BaseEntity{
    @Column(name = "speaker_name")
    private String speakerName;
    @Column(name = "description")
    private String description;
    @Column(name = "profile_picture")
    private String profilePictureUrl;

    public Speaker() {
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }
}
