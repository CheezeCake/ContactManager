/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "m1.pi.Delete"
)
@ActionRegistration(
        iconBase = "m1/pi/person_delete-128.png",
        displayName = "#CTL_Delete"
)
@ActionReference(path = "Toolbars/File", position = 100)
@Messages("CTL_Delete=Delete")
public final class Delete implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
