package test.com;

import com.codecool.Fact;
import com.codecool.FactParser;
import com.codecool.FactRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactRepositoryTest {
    @Test
    void getFactRepository() {
        FactParser factParser = new FactParser();
        FactRepository factRepository = factParser.getFactRepository();
        List<Fact> testFacts;
        assertEquals(factRepository, true);
    }
}