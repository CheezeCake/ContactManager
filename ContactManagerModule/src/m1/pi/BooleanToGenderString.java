/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

/**
 *
 * @author manu
 */
public class BooleanToGenderString extends org.jdesktop.beansbinding.Converter
{
    @Override
    public Object convertForward(Object value)
    {    
        return (Object)(((boolean)value) ? "Mr." : "Ms.");
    }

    @Override
    public Object convertReverse(Object value)
    {
        return (Object)(((String)value).equals("Mr."));
    }   
}
