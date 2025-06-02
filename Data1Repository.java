package cus.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data1Repository extends JpaRepository<Data1,Integer>{
	

}
