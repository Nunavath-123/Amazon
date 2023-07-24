package onlineshopping.amazon.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="amazon")
public class AmazonEntity {
   
	
   @Id
   @GeneratedValue(strategy =GenerationType.IDENTITY)
   private Long  id;
   
   @Column(name="name",nullable = false)                  
   private String name;
   
   @Column(name="cost")
   private int cost;
   
   public AmazonEntity() {
	   
   }
   
public AmazonEntity(String name, int cost) {
	super();
	this.name = name;
	this.cost = cost;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
   
}
