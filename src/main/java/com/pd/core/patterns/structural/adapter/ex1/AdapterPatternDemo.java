package com.pd.core.patterns.structural.adapter.ex1;

public class AdapterPatternDemo {
    public static void main(final String[] args) {

	testClassAdapter();
	testObjectAdapter();
    }

    private static void testObjectAdapter() {
	final SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
	final Volt v3 = getVolt(sockAdapter, 3);
	final Volt v12 = getVolt(sockAdapter, 12);
	final Volt v120 = getVolt(sockAdapter, 120);
	System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
	System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
	System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
    }

    private static void testClassAdapter() {
	final SocketAdapter sockAdapter = new SocketClassAdapterImpl();
	final Volt v3 = getVolt(sockAdapter, 3);
	final Volt v12 = getVolt(sockAdapter, 12);
	final Volt v120 = getVolt(sockAdapter, 120);
	System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
	System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
	System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
    }

    private static Volt getVolt(final SocketAdapter sockAdapter, final int i) {
	switch (i) {
	case 3:
	    return sockAdapter.get3Volt();
	case 12:
	    return sockAdapter.get12Volt();
	case 120:
	    return sockAdapter.get120Volt();
	default:
	    return sockAdapter.get120Volt();
	}
    }
}
