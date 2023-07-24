package onlineshopping.amazon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import onlineshopping.amazon.Entity.AmazonEntity;


public interface AmazonRepository extends JpaRepository<AmazonEntity, Integer>{
	
}
