package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class main7 {

	public static void main(String[] args) {
		IntegerProperty a = new SimpleIntegerProperty(4);
        IntegerProperty b = new SimpleIntegerProperty();
        System.out.println(b.getValue());
        b.bind(a.add(3));   //rang buoc
        a.setValue(12);
        System.out.println(b.getValue());
        a.setValue(10);
        System.out.println(b.getValue());

	}

}
