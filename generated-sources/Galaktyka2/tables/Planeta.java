/*
 * This file is generated by jOOQ.
*/
package Galaktyka2.tables;


import Galaktyka2.Public;
import Galaktyka2.tables.records.PlanetaRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class Planeta extends TableImpl<PlanetaRecord> {

    private static final long serialVersionUID = 1286346110;

    /**
     * The reference instance of <code>public.planeta</code>
     */
    public static final Planeta PLANETA = new Planeta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlanetaRecord> getRecordType() {
        return PlanetaRecord.class;
    }

    /**
     * The column <code>public.planeta.nazwa</code>.
     */
    public final TableField<PlanetaRecord, String> NAZWA = createField("nazwa", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>public.planeta.uklad</code>.
     */
    public final TableField<PlanetaRecord, String> UKLAD = createField("uklad", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>public.planeta.masa</code>.
     */
    public final TableField<PlanetaRecord, String> MASA = createField("masa", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>public.planeta.okres_orbitalny</code>.
     */
    public final TableField<PlanetaRecord, String> OKRES_ORBITALNY = createField("okres_orbitalny", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * Create a <code>public.planeta</code> table reference
     */
    public Planeta() {
        this("planeta", null);
    }

    /**
     * Create an aliased <code>public.planeta</code> table reference
     */
    public Planeta(String alias) {
        this(alias, PLANETA);
    }

    private Planeta(String alias, Table<PlanetaRecord> aliased) {
        this(alias, aliased, null);
    }

    private Planeta(String alias, Table<PlanetaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Planeta as(String alias) {
        return new Planeta(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Planeta rename(String name) {
        return new Planeta(name, null);
    }
}
