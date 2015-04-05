/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

import org.openide.awt.StatusLineElementProvider;
import java.awt.Component;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author manu
 */
@ServiceProvider(service=StatusLineElementProvider.class)
public class MyStatusLineElementProvider implements StatusLineElementProvider {
    private MyStatusBar bar = null;

    public MyStatusLineElementProvider() {
        bar = new MyStatusBar();
    }
    
    @Override
    public Component getStatusLineElement() {
        return bar;
    }
    
}
