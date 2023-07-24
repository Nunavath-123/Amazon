package onlineshopping.amazon.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import onlineshopping.amazon.Entity.AmazonEntity;
import onlineshopping.amazon.repo.AmazonRepository;
import onlineshopping.amazon.service.AmazonService;
@Service
public class AmazonServiceImpl implements AmazonService{
	
	private AmazonRepository amazonRepository;
	public AmazonServiceImpl(AmazonRepository amazonRepository) {
		super();
		this.amazonRepository = amazonRepository;
	}
     @Override
	public List<AmazonEntity> getAllAmazonEntities() {
		
		return amazonRepository.findAll();
	}

}
