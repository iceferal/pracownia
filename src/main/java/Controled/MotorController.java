package Controled;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Pracownia.tables.records.MotorRecord;

import java.util.List;

import static Pracownia.tables.Motor.MOTOR;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class MotorController {

    @Autowired
    public DSLContext jooq;


    @GetMapping("/motor")
    public List<Motor> motor() {
        return jooq.select().from(MOTOR).fetchInto(Motor.class);
    }

    @PostMapping("/motor")
    public void motor(@RequestBody Motor motor)
    {
        MotorRecord mr = jooq.newRecord(MOTOR);
        mr.setProducent(motor.producent);
        mr.setModel(motor.model);
        mr.setSymbol(motor.symbol);
        mr.setPojemnosc(motor.pojemnosc);
        mr.store();
    }

    @DeleteMapping("/motor/{producent}")
    public void delete(@PathVariable String producent)
    {
        MotorRecord mr = jooq.fetchOne(MOTOR, MOTOR.PRODUCENT.eq(producent));
        mr.delete();
    }
}
