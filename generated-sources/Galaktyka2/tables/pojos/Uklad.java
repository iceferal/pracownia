/*
 * This file is generated by jOOQ.
*/
package Galaktyka2.tables.pojos;


import Galaktyka2.tables.interfaces.IUklad;

import javax.annotation.Generated;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Uklad implements IUklad {

    private static final long serialVersionUID = 278972351;

    private String  nazwa;
    private Integer iloscPlanet;

    public Uklad() {}

    public Uklad(Uklad value) {
        this.nazwa = value.nazwa;
        this.iloscPlanet = value.iloscPlanet;
    }

    public Uklad(
        String  nazwa,
        Integer iloscPlanet
    ) {
        this.nazwa = nazwa;
        this.iloscPlanet = iloscPlanet;
    }

    @Size(max = 100)
    @Override
    public String getNazwa() {
        return this.nazwa;
    }

    @Override
    public Uklad setNazwa(String nazwa) {
        this.nazwa = nazwa;
        return this;
    }

    @Override
    public Integer getIloscPlanet() {
        return this.iloscPlanet;
    }

    @Override
    public Uklad setIloscPlanet(Integer iloscPlanet) {
        this.iloscPlanet = iloscPlanet;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Uklad (");

        sb.append(nazwa);
        sb.append(", ").append(iloscPlanet);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IUklad from) {
        setNazwa(from.getNazwa());
        setIloscPlanet(from.getIloscPlanet());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IUklad> E into(E into) {
        into.from(this);
        return into;
    }
}
