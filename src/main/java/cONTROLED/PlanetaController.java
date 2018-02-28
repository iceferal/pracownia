package cONTROLED;

import Galaktyka2.tables.records.PlanetaRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static Galaktyka2.tables.Planeta.PLANETA;


@RestController
@CrossOrigin(origins = "http://localhost:63342")
public class PlanetaController {

    @Autowired
    private DSLContext jooq;

    @GetMapping("/planeta")
    public List<Planeta> planeta() {
        return jooq.select().from(PLANETA).fetchInto(Planeta.class);
    }

    @PostMapping("/planeta")
    public void planeta(@RequestBody Planeta planeta)
    {
        PlanetaRecord pr = jooq.newRecord(PLANETA);
        pr.setNazwa(planeta.nazwa);
        pr.setMasa(planeta.masa);
        pr.setOkresOrbitalny(planeta.okres_orbitalny);
        pr.setUklad(planeta.uklad);
        pr.store();
    }

    @DeleteMapping("/planeta/{nazwa}")
    public void delete(@PathVariable String nazwa)
    {
        PlanetaRecord pr = jooq.fetchOne(PLANETA, PLANETA.NAZWA.eq(nazwa));
        pr.delete();
    }
}
