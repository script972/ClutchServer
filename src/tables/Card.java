package tables;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

/**
 * Created by script972 on 05.08.2017.
 */

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private CardGroup cardGroup;

    private String barkode;

    private String photoFront;

    private String photoBack;

    private String description;

    private Integer rang;

    private Date lastRequest;

    private Integer auther;

    private Integer inspection;

    private Boolean access;

    private Date dateAdd;

    public Card() {
    }

    public Card(Integer id, CardGroup cardGroup, String barkode, String photoFront, String photoBack, String description, Integer rang, Date lastRequest, Integer auther, Integer inspection, Boolean access, Date dateAdd) {
        this.id = id;
        this.cardGroup = cardGroup;
        this.barkode = barkode;
        this.photoFront = photoFront;
        this.photoBack = photoBack;
        this.description = description;
        this.rang = rang;
        this.lastRequest = lastRequest;
        this.auther = auther;
        this.inspection = inspection;
        this.access = access;
        this.dateAdd = dateAdd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CardGroup getCardGroup() {
        return cardGroup;
    }

    public void setCardGroup(CardGroup cardGroup) {
        this.cardGroup = cardGroup;
    }

    public String getBarkode() {
        return barkode;
    }

    public void setBarkode(String barkode) {
        this.barkode = barkode;
    }

    public String getPhotoFront() {
        return photoFront;
    }

    public void setPhotoFront(String photoFront) {
        this.photoFront = photoFront;
    }

    public String getPhotoBack() {
        return photoBack;
    }

    public void setPhotoBack(String photoBack) {
        this.photoBack = photoBack;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRang() {
        return rang;
    }

    public void setRang(Integer rang) {
        this.rang = rang;
    }

    public Date getLastRequest() {
        return lastRequest;
    }

    public void setLastRequest(Date lastRequest) {
        this.lastRequest = lastRequest;
    }

    public Integer getAuther() {
        return auther;
    }

    public void setAuther(Integer auther) {
        this.auther = auther;
    }

    public Integer getInspection() {
        return inspection;
    }

    public void setInspection(Integer inspection) {
        this.inspection = inspection;
    }

    public Boolean getAccess() {
        return access;
    }

    public void setAccess(Boolean access) {
        this.access = access;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }
}
