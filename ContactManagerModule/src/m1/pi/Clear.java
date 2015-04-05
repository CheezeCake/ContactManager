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
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;

@ActionID(
        category = "File",
        id = "m1.pi.Clear"
)
@ActionRegistration(
        displayName = "clear"
)
@ActionReference(path = "Menu/File", position = 1300)
@Messages("CTL_Clear=Clear")
public final class Clear implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Object result = DialogDisplayer.getDefault().notify(
                new NotifyDescriptor.Confirmation("Are you sure?", NotifyDescriptor.YES_NO_OPTION));
        
        if (result == NotifyDescriptor.YES_OPTION) {
            DialogDisplayer.getDefault().notify(
                    new NotifyDescriptor.Message("All contacts were deleted.", NotifyDescriptor.WARNING_MESSAGE));
        }
    }
}
