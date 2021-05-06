package com.example.sadi_A2.model;
import javax.persistence.*;

@Entity
@Table(name= "product")
public class Product {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String model;
    @Column
    private String brand;
    @Column
    private String company;
    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name="categoryId")
    private Category category;

    @Column
    private float sellingPrice;





    public Product() {
    }

    public Product(int id, String name, String model, String brand, String company, String description, float sellingPrice) {
        super();
        this.id = id;
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.company = company;
        this.description = description;
        this.sellingPrice = sellingPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getCompany() {
        return company;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }
}
