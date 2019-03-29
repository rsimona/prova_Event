/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.prova_events;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.enterprise.event.Event;

/**
 *
 * @author ramon.simona
 */
@RequestScoped
public class BeanEvent {
    @Inject Event<String> event;
    
    public void llencarEvent(){
        event.fire("S'ha llençat l'event");
    }
}
