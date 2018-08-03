package pl.akademiakodu.sellsword.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Customer {

    @OneToMany(mappedBy = "customer")
    private List<Sellsword> sellswords;

    public List<Sellsword> getSellswords() {
        return sellswords;
    }

    public void setSellswords(List<Sellsword> sellswords) {
        this.sellswords = sellswords;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private String quest;

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    @Override
    public String toString() {
        return getName() +" "+getSurname()+" "+getQuest();
    }
}
