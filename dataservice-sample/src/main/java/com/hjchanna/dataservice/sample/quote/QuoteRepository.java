package com.hjchanna.dataservice.sample.quote;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ChannaJ
 */
public interface QuoteRepository extends JpaRepository<Quote, Integer> {

    public List<Quote> findByUserName(String username);
}
