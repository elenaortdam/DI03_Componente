/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author elena
 */
public class FechaPersonalizadaPropertyEditorSupport extends PropertyEditorSupport {

    private FechaPersonalizadaPanel fechaPersonalizada = new FechaPersonalizadaPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    //método que indica de que clase es el custom editor que se debe usar
    @Override
    public Component getCustomEditor() {
        return fechaPersonalizada;
    }

    @Override
    public String getJavaInitializationString() {
        return "new programa.FechaPersonalizada(new programa.FechaPersonalizadaPanel().getSelectedValue().getCalendar())";
    }
   
    //método que nos permite recuperar la información introducida en el custom editor.
    @Override
    public Object getValue() {
        return fechaPersonalizada.getSelectedValue();
    }

}
