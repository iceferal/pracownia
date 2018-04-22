package Controled;

import Pracownia.tables.records.ModelRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static Pracownia.tables.Model.MODEL;


@RestController
@CrossOrigin(origins = "http://localhost:63342")
public class ModelController {

    @Autowired
    private DSLContext jooq;

    @GetMapping("model")
    public List<Model> model() {
        return jooq.select().from(MODEL).fetchInto(Model.class);
    }

    @PostMapping("/model")
    public void model(@RequestBody Model model)
    {
        ModelRecord ml = jooq.newRecord(MODEL);
        ml.setNazwa(model.nazwa);
        ml.setProdukcjaOd(model.produkcja_od);
        ml.setProdukcjaDo(model.produkcja_do);
        ml.setMasa(model.masa);
        ml.store();
    }

    @DeleteMapping("/model/{nazwa}")
    public void delete(@PathVariable String nazwa)
    {
        ModelRecord ml = jooq.fetchOne(MODEL, MODEL.NAZWA.eq(nazwa));
        delete(nazwa);
        ml.delete();
    }
}
