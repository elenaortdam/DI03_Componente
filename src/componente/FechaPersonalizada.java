/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author elena
 */
public class FechaPersonalizada implements Serializable {

    private Calendar calendar;

    public FechaPersonalizada(Calendar calendar) {
        this.calendar = calendar;

    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

}
