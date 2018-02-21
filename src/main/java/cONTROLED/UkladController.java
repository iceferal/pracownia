package cONTROLED;


import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static Galaktyka2.tables.Uklad.UKLAD;


@RestController
public class UkladController {

    @Autowired
    public DSLContext jooq;

    @GetMapping("/greeting")
    public List<Uklad> uklad() {
        return jooq.select().from(UKLAD).fetchInto(Uklad.class);
    }
}
