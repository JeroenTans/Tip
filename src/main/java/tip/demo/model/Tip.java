package tip.demo.model;

import javax.persistence.*;

@Entity
@Table
public class Tip {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private byte[] image;

    private String address;

    private String explanation;

    private boolean privateTip;

    private boolean publicTip;

    private boolean standardTip;

    public Tip() {
    }

    public Tip(byte[] image, String address, String explanation, boolean privateTip, boolean publicTip, boolean standardTip) {
        this.image = image;
        this.address = address;
        this.explanation = explanation;
        this.privateTip = privateTip;
        this.publicTip = publicTip;
        this.standardTip = standardTip;
    }

    public boolean isStandardTip() {
        return standardTip;
    }
    public void setStandardTip(boolean standardTip) {
        this.standardTip = standardTip;
    }
    public boolean isPublicTip() {
        return publicTip;
    }
    public void setPublicTip(boolean publicTip) {
        this.publicTip = publicTip;
    }
    public boolean isPrivateTip() {
        return privateTip;
    }
    public void setPrivateTip(boolean privateTip) {
        this.privateTip = privateTip;
    }
    public String getExplanation() {
        return explanation;
    }
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
