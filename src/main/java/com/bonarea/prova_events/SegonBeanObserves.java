/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.prova_events;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;

/**
 *
 * @author ramon.simona
 */
@RequestScoped
public class SegonBeanObserves {

    public void escoltaEvent2(@Observes String eventString) {
        System.out.println("SegonBeanObserves: " + eventString);
    }
}
