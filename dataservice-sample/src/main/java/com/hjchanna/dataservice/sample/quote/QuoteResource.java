package com.hjchanna.dataservice.sample.quote;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ChannaJ
 */
@RestController
@RequestMapping("/dataservice/quote")
public class QuoteResource {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/{username}")
    public List<String> get(@PathVariable("username") final String userName) {
        return quoteService.findQuoteByUsername(userName)
                .stream()
                .map(quote -> quote.getQuote())
                .collect(Collectors.toList());
    }

    @PostMapping
    public List<String> save(@RequestBody List<Quote> quotes) {
        quoteService.saveQuotes(quotes);

        return quotes
                .stream()
                .map(quote -> quote.getUserName())
                .collect(Collectors.toSet())
                .stream()
                .map(quoteService::findQuoteByUsername)
                .flatMap(quote -> quote.stream().map(quoteString -> quoteString.getQuote()))
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{username}")
    public boolean delete(@PathVariable("username") String userName) {
        quoteService.deleteQuotes(quoteService.findQuoteByUsername(userName));

        return quoteService.findQuoteByUsername(userName).isEmpty();
    }

}
