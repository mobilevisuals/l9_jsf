/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
@Named(value = "viewActionManagedBean")
@SessionScoped
public class ViewActionManagedBean implements Serializable {

    /**
     * Creates a new instance of ViewActionManagedBean
     */
    public ViewActionManagedBean() {
    }

    public String turn()
    {

        return "index3";}

}