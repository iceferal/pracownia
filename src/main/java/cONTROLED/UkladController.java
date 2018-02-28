package cONTROLED;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Galaktyka2.tables.records.UkladRecord;

import java.util.List;

import static Galaktyka2.tables.Uklad.UKLAD;


@RestController
@CrossOrigin(origins = "http://localhost:63342")
public class UkladController {

    @Autowired
    public DSLContext jooq;


    @GetMapping("/uklad")
    public List<Uklad> uklad() {
        return jooq.select().from(UKLAD).fetchInto(Uklad.class);
    }

    @PostMapping("/uklad")
    public void uklad(@RequestBody Uklad uklad)
    {
        UkladRecord ur = jooq.newRecord(UKLAD);
        ur.setNazwa(uklad.nazwa);
        ur.setIloscPlanet(uklad.ilosc_planet);
        ur.store();
    }

    @DeleteMapping("/uklad/{nazwa}")
    public void delete(@PathVariable String nazwa)
    {
        UkladRecord ur = jooq.fetchOne(UKLAD, UKLAD.NAZWA.eq(nazwa));
        ur.delete();
    }
}
