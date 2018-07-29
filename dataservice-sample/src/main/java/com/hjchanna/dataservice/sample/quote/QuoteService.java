package com.hjchanna.dataservice.sample.quote;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ChannaJ
 */
@Service
@Transactional(readOnly = true)
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    public List<Quote> findQuoteByUsername(String username) {
        return quoteRepository.findByUserName(username);
    }

    @Transactional
    public void saveQuotes(List<Quote> quotes) {
        quotes
                .stream()
                .forEach(quoteRepository::save);
    }

    @Transactional
    public void deleteQuotes(List<Quote> quotes) {
        quotes
                .stream()
                .forEach(quoteRepository::delete);
    }

}
