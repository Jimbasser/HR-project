package be.vdab.training.utilities;

import java.time.LocalDate;
import java.util.Date;

public class DateUtility {

    public final static LocalDate convertDateToLocalDate(Date date) {
        return new java.sql.Date(date.getTime()).toLocalDate();
    }

    public final static Date convertLocalDatetoDate(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }
}

