/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entites.ServiceProvider;
import java.util.ArrayList;

/**
 *
 * @author Who Am I
 */
public interface IRechecheProService {
    public ArrayList<ServiceProvider>  listServiceProvider( String gvrntProviderChoice, String serviceProviderChoice) ;
    
}
