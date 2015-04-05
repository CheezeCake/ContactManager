/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author manu
 */
public class EMailValidator extends org.jdesktop.beansbinding.Validator
{
    @Override
    public Result validate(Object value) {
        Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher matcher = pattern.matcher((String)value);
        return (matcher.find()) ? null : new Result(null, "Invalid e-mail");
    }
}
