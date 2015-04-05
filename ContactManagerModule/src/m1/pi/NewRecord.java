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
        category = "File",
        id = "m1.pi.NewRecord"
)
@ActionRegistration(
        iconBase = "m1/pi/Add_Friend-128.png",
        displayName = "#CTL_NewRecord"
)
@ActionReference(path = "Toolbars/File", position = 300)
@Messages("CTL_NewRecord=NewRecord")
public final class NewRecord implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        new ContactWizardAction().actionPerformed(e);
    }
}
